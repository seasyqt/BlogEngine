package ru.skillbox.blog.api.response;

/**
 * * "id": 576,
 * * "name": "Дмитрий Петров",
 * * "photo": "/avatars/ab/cd/ef/52461.jpg",
 * * "email": "petrov@petroff.ru",
 * * "moderation": true,
 * * "moderationCount": 56,
 * * "settings": true
 */

public class UserResponse {
    private int id;
    private String name;
    private String photo;
    private String email;
    private boolean moderation;
    private int moderationCount;
    private boolean settings;
}
