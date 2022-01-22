package ru.skillbox.blog.api.response;

import lombok.Data;

/**
 * {
 * "title": "DevPub",
 * "subtitle": "Рассказы разработчиков",
 * "phone": "+7 903 666-44-55",
 * "email": "mail@mail.ru",
 * "copyright": "Дмитрий Сергеев",
 * "copyrightFrom": "2005"
 * }
 */
@Data
public class InitResponse {
    private String title = "DevBlog";
    private String subtitle = "Истории разработчиков";
    private String phone = "+7 902 413-44-11";
    private String email = "dev_mail@mail.ru";
    private String copyright = "Кирилл Токарев";
    private String copyrightFrom = "2022";

}
