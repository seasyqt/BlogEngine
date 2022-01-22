package ru.skillbox.blog.model.enums;


public enum GlobalSettingsCode {
    MULTIUSER_MODE, POST_PREMODERATION, STATISTICS_IS_PUBLIC;

    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
