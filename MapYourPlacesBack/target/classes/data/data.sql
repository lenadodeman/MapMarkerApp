-- Données fictives pour la table Users
INSERT INTO USERS (id, username, email, password)
VALUES (1, 'JohnDoe', 'john.doe@example.com', 'password1'),
       (2, 'JaneSmith', 'jane.smith@example.com', 'password2'),
       (3, 'AliceJohnson', 'alice.johnson@example.com', 'password3'),
       (4, 'BobBrown', 'bob.brown@example.com', 'password4'),
       (5, 'EvaWhite', 'eva.white@example.com', 'password5');

-- Données fictives pour la table Icon
INSERT INTO ICON (id, unicode)
VALUES (1, 'U+1F601'),
       (2, 'U+1F602'),
       (3, 'U+1F603'),
       (4, 'U+1F604'),
       (5, 'U+1F605');

-- Données fictives pour la table Tags
INSERT INTO TAG (id, label)
VALUES (1, 'Tag 1'),
       (2, 'Tag 2'),
       (3, 'Tag 3'),
       (4, 'Tag 4'),
       (5, 'Tag 5');

-- Données fictives pour la table SharedToken
INSERT INTO EXTERNAL_TOKEN (id, url, token)
VALUES (1, 'http://example.com/1', 'shared_token_1'),
       (2, 'http://example.com/2', 'shared_token_2'),
       (3, 'http://example.com/3', 'shared_token_3'),
       (4, 'http://example.com/4', 'shared_token_4'),
       (5, 'http://example.com/5', 'shared_token_5');


-- Données fictives pour la table Localisation
INSERT INTO LOCALISATION (id, name, description, longitude, latitude, icon_id, user_id)
VALUES (1, 'Location 1', 'Description 1', 12.345678, -45.678901, 1, 1),
       (2, 'Location 2', 'Description 2', 23.456789, -56.789012, 2, 2),
       (3, 'Location 3', 'Description 3', 34.567890, -67.890123, 3, 3),
       (4, 'Location 4', 'Description 4', 45.678901, -78.901234, 4, 4),
       (5, 'Location 5', 'Description 5', 56.789012, -89.012345, 5, 5);


-- Données fictives pour la table Localisation_Tags
INSERT INTO LOCALISATION_TAG (id, tag_id, localisation_id)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3),
       (4, 4, 4),
       (5, 5, 5);

-- Données fictives pour la table Token
INSERT INTO TOKEN (id, modify_right, creation_date, expiration_date, creator_id, tag_id, localisation_id)
VALUES (1, TRUE, '2024-02-08', '2024-03-08', 1, 1, NULL);
