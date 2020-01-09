-- tables
-- Table: Category
CREATE TABLE category (
    category_id serial  NOT NULL,
    category_name varchar  NOT NULL UNIQUE,
    CONSTRAINT category_pk PRIMARY KEY (category_id)
);
CREATE TABLE curriculum (
    curriculum_id serial NOT NULL,
    curriculum_name varchar NOT NULL UNIQUE,
    CONSTRAINT curriculum_pk PRIMARY KEY (curriculum_id)
);
-- Table: Curriculum_Skill
CREATE TABLE curriculum_skill (
    curriculum int  NOT NULL,
    skill int  NOT NULL,
    CONSTRAINT curriculum_skill_pk PRIMARY KEY (curriculum, skill)
);

-- Table: Skill
CREATE TABLE skill (
    skill_id serial  NOT NULL,
    skill_name varchar  NOT NULL UNIQUE,
    category int  NOT NULL,
    CONSTRAINT skill_pk PRIMARY KEY (skill_id)
);

-- Table: Visualization
CREATE TABLE visualization (
    visualization_id serial  NOT NULL,
    visualization_name varchar  NOT NULL UNIQUE,
    CONSTRAINT visualisation_pk PRIMARY KEY (visualization_id)
);

-- Table: Visualization_Curriculum
CREATE TABLE visualization_curriculum (
    visualization int  NOT NULL,
    curriculum int  NOT NULL,
    CONSTRAINT visualization_curriculum_pk PRIMARY KEY (visualization, curriculum)
);

-- foreign keys
-- Reference: Curr_Cat_Curriculum (table: Curriculum_Skill)
ALTER TABLE curriculum_skill ADD CONSTRAINT curr_cat_curriculum
    FOREIGN KEY (curriculum)
    REFERENCES curriculum (curriculum_id)  
;
-- Reference: Curr_Cat_Skill (table: Curriculum_Skill)
ALTER TABLE curriculum_skill ADD CONSTRAINT curr_cat_skill
    FOREIGN KEY (skill)
    REFERENCES skill (skill_id)  
;

-- Reference: Skill_Category (table: Skill)
ALTER TABLE skill ADD CONSTRAINT skill_category
    FOREIGN KEY (category)
    REFERENCES category (category_id)  
;

-- Reference: Vis_Curr_Curriculum (table: Visualization_Curriculum)
ALTER TABLE visualization_curriculum ADD CONSTRAINT vis_curr_curriculum
    FOREIGN KEY (curriculum)
    REFERENCES curriculum (curriculum_id)  
;

-- Reference: Vis_Curr_Visualization (table: Visualization_Curriculum)
ALTER TABLE visualization_curriculum ADD CONSTRAINT vis_curr_visualization
    FOREIGN KEY (visualization)
    REFERENCES visualization (visualization_id)  
;