package org.tmluxcode.response;

import lombok.Data;

import java.util.List;

@Data
public class LxPostPagedResponse<T> {

    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
    private boolean last;
}
