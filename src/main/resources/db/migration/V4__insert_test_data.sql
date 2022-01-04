INSERT INTO captcha_codes
    (id, time, code, secret_code)
VALUES (1, '2022-01-03 12:15:00', 'code1', 'secretCode1'),
       (2, '2022-01-02 15:15:00', 'code2', 'secretCode1');

INSERT INTO users
    (id, is_moderator, reg_time, name, email, password, code, photo)
VALUES (1, 0, '2022-01-03 13:15:00', 'Иван', 'test1@mail.ru', '12345678', null, null),
       (2, 0, '2022-01-03 15:15:00', 'Сергей', 'test2@gmail.com', '23456789', null, null),
       (3, 1, '2022-01-02 18:15:00', 'Владимир', 'test3@mail.ru', '34567890', null, null);

INSERT INTO posts
(id, is_active, moderation_status, moderator_id, user_id, time, title, text, view_count)
VALUES (1, 1, 'NEW', 3, 1, '2022-01-03 15:15:00', 'Научная статья про природу',
        concat('Природа – одна из самых удивительных вещей. ',
               'Как минимум, она существенно отличает Землю от других планет. '), 10),
       (2, 1, 'ACCEPTED', 3, 2, '2022-01-03 16:15:00', 'Как стать человеком',
        concat('О том, как стать человеком, лучше всего спрашивать у тех, кто уже таким стал, ',
               '- они смогут поделиться собственным важным опытом. '), 0),
       (3, 0, 'DECLINED', 3, 2, '2022-01-02 19:15:00', 'Путешествие из Петербурга в Москву',
        concat('Отправившись в Москву после ужина с друзьями, ',
               'герой проснулся только на следующей почтовой станции — София. '), 100);

INSERT INTO tags
    (id, name)
VALUES (1, 'travel'),
       (2, 'human');

INSERT INTO tag2post
    (post_id, tag_id)
VALUES (3, 1),
       (2, 2);

INSERT INTO post_comments
    (id, parent_id, post_id, user_id, time, text)
VALUES (1, null, 3, 1, '2022-01-02 20:15:00', 'Прикольный пост, мне нравится'),
       (2, 1, 3, 3, '2022-01-02 21:15:00', 'Спасибо!'),
       (3, null, 2, 3, '2022-01-03 17:15:00', 'Тоже хочу быть человеком');

INSERT INTO post_votes
    (id, user_id, post_id, time, value)
VALUES (1, 3, 3, '2022-01-03 11:15:00', 1),
       (2, 1, 3, '2022-01-03 13:15:00', -1),
       (3, 1, 2, '2022-01-03 13:35:00', -1),
       (4, 2, 3, '2022-01-03 14:15:00', 1);