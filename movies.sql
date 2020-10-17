create datebase ·movies·
use `movies`


CREATE TABLE `category` (
  `categoryID` int(11) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`categoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `category`(`categoryID`,`description`) values
(1,'科幻片是类型片的一种，该类作品采用科幻元素作为题材，以建立在科学上的幻想性情景为背景，在此'),
(2,'战争片，亦称“军事片”，以战争史上重大军事行动为题材的影片。较常见的战争片有两种类型，一种'),
(3,'动漫，即动画、漫画的合称，指动画与漫画的集合，取这两个词的第一个字合二为一称之为“动漫”，');

CREATE TABLE `movies` (
  `movieID` int(11) NOT NULL COMMENT 'movieID',
  `title` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'the title of movie',
  `plot` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `image` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `categoryID` int(11) NOT NULL,
  PRIMARY KEY (`movieID`),
  KEY `categoryID` (`categoryID`),
  CONSTRAINT `categoryID` FOREIGN KEY (`categoryID`) REFERENCES `category` (`categoryID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `movies`(`movieID`,`title`,`plot`,`date`,`image`,`categoryID`) values
(1,'复仇者联盟4：终局之战 Avengers: Endgame','After the devastating event of "Avenger alliance 3: Infinite War", the universe was devastated by the action of crazy Titan. No matter what will happen to the future, the avenger alliance must rally again with the help of the remaining allies, in order to','2019年','null',1),
(2,'八佰','《八佰》是由华谊兄弟电影有限公司和北京七印象文化传媒有限公司出品，腾讯影业文化传播有限公司、北京光线影业有限公司和阿里巴巴影业（北京）有限公司联合出品，导演管虎执导，黄志忠、欧豪、王千源、姜武、张译、杜淳、魏晨、李晨、俞灏明等主演的战争题材影片 [1]  。
该片取材1937年淞沪会战期间，讲述了史称“八百壮士”的中国国民革命军第三战区88师524团的一个加强营，固守苏州河畔的四行仓库、阻击日军的故事 [2]  。
该片于2020年8月21日在中国内地上映 [3]  。','2020年','null',2),
(3,'你的名字','《你的名字。》是由新海诚执导，由神木隆之介、上白石萌音担任主要配音的一部原创日本动画电影 [1]  。作品于2016年8月26日在日本上映。中国内地于2016年12月2日上映。作品讲述了男女高中生在梦中相遇，并寻找彼此的故事。中国大陆于2017年8月26日全网首播。','2016年','null',3),
(4,'龙猫','《龙猫》是由宫崎骏执导，日高法子、坂本千夏、糸井重里配音的动画电影，于1988年4月16日在日本上映。高清重制版于2018年12月14日在中国公映。
该片讲述了草壁达郎的妻子草壁靖子生病住院后，他带着草壁皋月与四岁的妹妹草壁梅回到乡间居住的故事。','1988年','null',3),
(5,'哪吒之魔童降世','天地灵气孕育出一颗能量巨大的混元珠，元始天尊将混元珠提炼成灵珠和魔丸，灵珠投胎为人，助周伐纣时可堪大用；而魔丸则会诞出魔王，为祸人间。元始天尊启动了天劫咒语，3年后天雷将会降临，摧毁魔丸。太乙受命将灵珠托生于陈塘关李靖家的儿子哪吒身上。然而阴差阳错，灵珠和魔丸竟然被掉包。本应是灵珠英雄的哪吒却成了混世大魔王，这调皮捣蛋顽劣不堪的哪吒却徒有一颗做英雄的心。然而面对众人对哪吒的误解和即将来临的天雷的降临，哪吒是否命中注定会立地成魔，他将何去何从 [6]  。','2019年7月26日','null',3);

CREATE TABLE `person` (
  `personID` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  `birthday` date NOT NULL,
  `photo` varchar(45) NOT NULL,
  PRIMARY KEY (`personID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `person`(`personID`,`name`,`role`,`birthday`,`photo`) values
(1,'小罗伯特·唐尼','iron man','1965-04-04','null');

CREATE TABLE `person_movie` (
  `ID` int(11) NOT NULL,
  `personID` int(11) NOT NULL,
  `movieID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `personID` (`personID`),
  KEY `moviesID` (`movieID`),
  CONSTRAINT `moviesID` FOREIGN KEY (`movieID`) REFERENCES `movies` (`movieID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `personID` FOREIGN KEY (`personID`) REFERENCES `person` (`personID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `person_movie`(`ID`,`personID`,`movieID`) values
(1,1,1);
SET FOREIGN_KEY_CHECKS = 1;

