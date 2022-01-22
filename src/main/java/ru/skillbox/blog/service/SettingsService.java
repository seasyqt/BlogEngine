package ru.skillbox.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.skillbox.blog.api.response.SettingsResponse;
import ru.skillbox.blog.model.enums.GlobalSettingsCode;
import ru.skillbox.blog.repository.SettingsRepository;

@Service
public class SettingsService {

    @Autowired
    private SettingsRepository settingsRepository;


    public SettingsResponse getGlogalSettings() {
        SettingsResponse responseGlobalSettings = new SettingsResponse();

        settingsRepository
                .findAll().forEach(s -> {
            if (s.getCode() == GlobalSettingsCode.MULTIUSER_MODE) responseGlobalSettings.setMultiUserMode(s.getValue());
            if (s.getCode() == GlobalSettingsCode.POST_PREMODERATION)
                responseGlobalSettings.setPostPreModeration(s.getValue());
            if (s.getCode() == GlobalSettingsCode.STATISTICS_IS_PUBLIC)
                responseGlobalSettings.setStatisticsIsPublic(s.getValue());

        });
        return responseGlobalSettings;

    }

}
