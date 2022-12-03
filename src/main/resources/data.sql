DROP TABLE IF EXISTS todo;
 
CREATE TABLE todo (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nom VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL
);

INSERT INTO todo (nom, description) VALUES
  ('todo 1', 'une description de todo'),
  ('todo 2', 'grippe ou covid?');
  
