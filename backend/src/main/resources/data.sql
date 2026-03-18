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

INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (10, 'Salzburg', 'FC Red Bull Salzburg', 'SAL', 'AUT') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (11, 'Sturm Graz', 'SK Sturm Graz', 'STU', 'AUT') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (12, 'KAC', 'EC KAC Klagenfurt', 'KAC', 'AUT') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (13, 'Vienna Capitals', 'Vienna Capitals', 'CAP', 'AUT') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (14, 'Barcelona', 'FC Barcelona', 'BAR', 'ESP') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (15, 'Real Madrid', 'Real Madrid CF', 'RMA', 'ESP') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (16, 'Bayern Munich', 'FC Bayern München', 'BAY', 'GER') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (17, 'PSG', 'Paris Saint-Germain', 'PSG', 'FRA') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (18, 'Manchester City', 'Manchester City FC', 'MCI', 'ENG') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (19, 'Arsenal', 'Arsenal FC', 'ARS', 'ENG') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (20, 'Inter Milan', 'FC Internazionale Milano', 'INT', 'ITA') ON CONFLICT DO NOTHING;
INSERT INTO teams (id, name, official_name, abbreviation, team_country_code) VALUES (21, 'Atletico Madrid', 'Club Atletico de Madrid', 'ATM', 'ESP') ON CONFLICT DO NOTHING;


INSERT INTO sports (id, name) VALUES (2, 'Ice Hockey') ON CONFLICT DO NOTHING;
INSERT INTO stages (id, name, ordering) VALUES ('QUARTER FINAL', 'QUARTER FINAL', 5) ON CONFLICT DO NOTHING;
INSERT INTO stages (id, name, ordering) VALUES ('SEMI FINAL', 'SEMI FINAL', 6) ON CONFLICT DO NOTHING;
INSERT INTO stages (id, name, ordering) VALUES ('GROUP STAGE', 'GROUP STAGE', 1) ON CONFLICT DO NOTHING;


-- Ocak 2026
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-01-07', '18:00:00', 2, 1, 'Salzburg', 1, 10, 11, 'GROUP STAGE') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-01-10', '20:45:00', 3, 0, 'Barcelona', 1, 14, 21, 'GROUP STAGE') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-01-14', '19:00:00', 1, 1, null, 1, 15, 16, 'GROUP STAGE') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-01-18', '17:30:00', 4, 2, 'KAC', 2, 12, 13, 'GROUP STAGE') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-01-21', '20:00:00', 0, 2, 'PSG', 1, 17, 18, 'GROUP STAGE') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-01-25', '15:00:00', 1, 0, 'Arsenal', 1, 19, 20, 'GROUP STAGE') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-01-28', '20:45:00', 2, 2, null, 1, 16, 14, 'GROUP STAGE') ON CONFLICT DO NOTHING;

-- Şubat 2026
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-02-04', '20:00:00', 3, 1, 'Real Madrid', 1, 15, 17, 'ROUND OF 16') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-02-07', '18:30:00', 2, 0, 'Barcelona', 1, 14, 20, 'ROUND OF 16') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-02-11', '19:45:00', 1, 3, 'Manchester City', 1, 19, 18, 'ROUND OF 16') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-02-14', '20:00:00', 5, 3, 'KAC', 2, 12, 13, 'ROUND OF 16') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-02-18', '17:00:00', 2, 1, 'Salzburg', 1, 10, 21, 'ROUND OF 16') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-02-22', '20:45:00', 0, 1, 'Bayern Munich', 1, 15, 16, 'ROUND OF 16') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-02-25', '19:00:00', 3, 2, 'Inter Milan', 1, 20, 17, 'ROUND OF 16') ON CONFLICT DO NOTHING;

-- Mart 2026
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-03-04', '20:00:00', 1, 0, 'Barcelona', 1, 14, 15, 'QUARTER FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-03-07', '18:00:00', 2, 1, 'Manchester City', 1, 18, 20, 'QUARTER FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'played', '2026-03-11', '20:45:00', 3, 0, 'Bayern Munich', 1, 16, 19, 'QUARTER FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-03-19', '20:00:00', null, null, null, 1, 10, 14, 'QUARTER FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-03-22', '18:30:00', null, null, null, 2, 12, 13, 'QUARTER FINAL') ON CONFLICT DO NOTHING;

-- Nisan 2026
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-04-01', '20:45:00', null, null, null, 1, 14, 18, 'SEMI FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-04-05', '19:00:00', null, null, null, 1, 16, 15, 'SEMI FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-04-09', '20:00:00', null, null, null, 2, 12, 13, 'SEMI FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-04-15', '18:00:00', null, null, null, 1, 10, 11, 'SEMI FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-04-22', '20:45:00', null, null, null, 1, 19, 21, 'SEMI FINAL') ON CONFLICT DO NOTHING;

-- Mayıs 2026
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-05-06', '20:00:00', null, null, null, 1, 14, 16, 'FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-05-13', '19:00:00', null, null, null, 2, 12, 13, 'FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-05-20', '20:45:00', null, null, null, 1, 18, 15, 'FINAL') ON CONFLICT DO NOTHING;

-- Haziran 2026
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-06-03', '20:00:00', null, null, null, 1, 10, 18, 'FINAL') ON CONFLICT DO NOTHING;
INSERT INTO events (season, status, date_venue, time_venue_utc, home_goals, away_goals, winner, _sport_id, _home_team_id, _away_team_id, _stage_id) VALUES (2026, 'scheduled', '2026-06-10', '19:00:00', null, null, null, 1, 14, 15, 'FINAL') ON CONFLICT DO NOTHING;