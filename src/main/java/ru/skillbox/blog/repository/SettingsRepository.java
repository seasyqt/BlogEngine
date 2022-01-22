package ru.skillbox.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillbox.blog.model.GlobalSetting;

@Repository
public interface SettingsRepository extends JpaRepository<GlobalSetting, Long> {
}
