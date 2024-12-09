package com.example.epic7_university.common.utils;

import com.example.epic7_university.common.dto.PageResponse;
import org.springframework.data.domain.Page;


public class PageUtils {
    public static <T> PageResponse<T> toPageResponse(Page<T> page) {
        return new PageResponse<>(page.getNumber(), page.getSize(), page.getTotalElements(), page.getContent());
    }
}