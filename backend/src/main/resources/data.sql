-- Sports
INSERT INTO sports (id, name) VALUES (1, 'Football') ON CONFLICT DO NOTHING;
INSERT INTO sports (id, name) VALUES (2, 'Ice Hockey') ON CONFLICT DO NOTHING;

-- Stages
INSERT INTO stages (id, name, ordering) VALUES ('ROUND OF 16', 'ROUND OF 16', 4) ON CONFLICT DO NOTHING;
INSERT INTO stages (id, name, ordering) VALUES ('FINAL', 'FINAL', 7) ON CONFLICT DO NOTHING;

-- Teams
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (1, 'Al Shabab', 'Al Shabab FC', 'SHA', 'KSA') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (2, 'Nasaf', 'FC Nasaf', 'NAS', 'UZB') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (3, 'Al Hilal', 'Al Hilal Saudi FC', 'HIL', 'KSA') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (4, 'Shabab Al Ahli', 'SHABAB AL AHLI DUBAI', 'SAH', 'UAE') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (5, 'Al Duhail', 'AL DUHAIL SC', 'DUH', 'QAT') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (6, 'Al Rayyan', 'AL RAYYAN SC', 'RYN', 'QAT') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (7, 'Al Faisaly', 'Al Faisaly FC', 'FAI', 'KSA') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (8, 'Foolad', 'FOOLAD KHOUZESTAN FC', 'FLD', 'IRN') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (9, 'Urawa Reds', 'Urawa Red Diamonds', 'RED', 'JPN') ON CONFLICT DO NOTHING;

-- Events (JSON verisinden)
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id)
VALUES (2024, 'played', '2024-01-03', '00:00:00', 1, 2, 'Nasaf', 1, 1, 2, 'ROUND OF 16') ON CONFLICT DO NOTHING;

INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id)
VALUES (2024, 'scheduled', '2024-01-03', '16:00:00', null, null, null, 1, 3, 4, 'ROUND OF 16') ON CONFLICT DO NOTHING;

INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id)
VALUES (2024, 'scheduled', '2024-01-04', '15:25:00', null, null, null, 1, 5, 6, 'ROUND OF 16') ON CONFLICT DO NOTHING;

INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id)
VALUES (2024, 'scheduled', '2024-01-04', '08:00:00', null, null, null, 1, 7, 8, 'ROUND OF 16') ON CONFLICT DO NOTHING;

INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id)
VALUES (2024, 'scheduled', '2024-01-19', '00:00:00', null, null, null, 1, null, 9, 'FINAL') ON CONFLICT DO NOTHING;