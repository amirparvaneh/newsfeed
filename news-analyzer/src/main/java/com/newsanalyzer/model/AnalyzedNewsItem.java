package com.newsanalyzer.model;

import com.mocknewsfeed.model.NewsItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnalyzedNewsItem {
    private NewsItem newsItem;
    private long timestamp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnalyzedNewsItem that = (AnalyzedNewsItem) o;
        return newsItem.getHeadline().equals(that.newsItem.getHeadline()) &&
                newsItem.getPriority() == that.newsItem.getPriority();
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsItem.getHeadline(), newsItem.getPriority());
    }
}
