package ru.skillbox.blog.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * {
 * "MULTIUSER_MODE": false,
 * "POST_PREMODERATION": true,
 * "STATISTICS_IS_PUBLIC": true
 * }
 */

//TODO можно попробовать использовать @JsonUnwrapped на Мапу которая содержит стринговое значение в
// качестве ключа, а значение булевое, возможно тогда можно в SettingsService собирать простую мапу и заполнять респонс

@Data
public class SettingsResponse {

    @JsonProperty("MULTIUSER_MODE")
    private boolean multiUserMode;

    @JsonProperty("POST_PREMODERATION")
    private boolean postPreModeration;

    @JsonProperty("STATISTICS_IS_PUBLIC")
    private boolean statisticsIsPublic;
}
