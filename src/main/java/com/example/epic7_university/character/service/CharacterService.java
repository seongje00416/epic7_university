package com.example.epic7_university.character.service;

import com.example.epic7_university.character.dto.request.AddNewHeroRequest;
import com.example.epic7_university.character.dto.request.AddNewHeroSkillRequest;
import com.example.epic7_university.character.dto.response.GetAllHerosResponse;
import com.example.epic7_university.character.dto.response.GetHeroDetailResponse;
import com.example.epic7_university.character.entity.Hero;
import com.example.epic7_university.character.entity.Skill;
import com.example.epic7_university.character.exception.HeroNotFoundException;
import com.example.epic7_university.character.repository.CharacterRepository;
import com.example.epic7_university.character.repository.SkillRepository;
import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.utils.PageUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final SkillRepository skillRepository;

    public PageResponse<GetAllHerosResponse> getAllHeros( PageRequest pageRequest) {
        return PageUtils.toPageResponse( characterRepository.findAll( pageRequest ) )
                .map( GetAllHerosResponse::of );
    }

    public GetHeroDetailResponse getHeroDetail( Long id) {
        Hero hero = characterRepository.findById(id).orElseThrow(HeroNotFoundException::new);
        return GetHeroDetailResponse.of( hero );
    }

    @Transactional
    public Long addHeroInformation(AddNewHeroRequest heroRequest ){
        Hero hero = Hero.builder()
                .name(heroRequest.name() )
                .realName(heroRequest.realName())
                .constellation( heroRequest.constellation() )
                .heroClass( heroRequest.heroClass() )
                .element( heroRequest.element() )
                .imprintRelease( heroRequest.imprintRelease() )
                .irBaseValue(heroRequest.irBaseValue() )
                .irUpValue(heroRequest.irUpValue() )
                .imprintConcentration( heroRequest.imprintConcentration() )
                .icBaseValue( heroRequest.icBaseValue() )
                .icUpValue( heroRequest.icUpValue() )
                .birthGrade( heroRequest.birthGrade() )
                .getType( heroRequest.getType() )
                .mainStats( heroRequest.mainStats() )
                .build();
        return characterRepository.save(hero).getId();
    }

    @Transactional
    public void addHeroSkill(AddNewHeroSkillRequest addNewHeroSkillRequest ){
        Hero useHero = characterRepository.findById( addNewHeroSkillRequest.heroID() ).orElseThrow(HeroNotFoundException::new);
        Skill skill = Skill.builder()
                .name( addNewHeroSkillRequest.name() )
                .hero( useHero )
                .skillType( addNewHeroSkillRequest.skillType() )
                .skillNumber(addNewHeroSkillRequest.skillNum() )
                .description( addNewHeroSkillRequest.description() )
                .maxEnhanceValue( addNewHeroSkillRequest.maxLevel() )
                .soulBurnCount( addNewHeroSkillRequest.soulBurnCount() )
                .soulBurnEffect( addNewHeroSkillRequest.soulBurnEffect() )
                .build();
        skillRepository.save( skill );
    }
}
