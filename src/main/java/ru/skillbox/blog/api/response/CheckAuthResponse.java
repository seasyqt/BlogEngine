package ru.skillbox.blog.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * {
 * "result": true,
 * "user": {
 * "id": 576,
 * "name": "Дмитрий Петров",
 * "photo": "/avatars/ab/cd/ef/52461.jpg",
 * "email": "petrov@petroff.ru",
 * "moderation": true,
 * "moderationCount": 56,
 * "settings": true
 * } }
 */
@Data
@AllArgsConstructor
public class CheckAuthResponse extends ResultResponse {
    //TODO раскомментировать
    //
    // private UserResponse user;
}
