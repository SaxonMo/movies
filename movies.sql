create datebase ��movies��
use `movies`


CREATE TABLE `category` (
  `categoryID` int(11) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`categoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `category`(`categoryID`,`description`) values
(1,'�ƻ�Ƭ������Ƭ��һ�֣�������Ʒ���ÿƻ�Ԫ����Ϊ��ģ��Խ����ڿ�ѧ�ϵĻ������龰Ϊ�������ڴ�'),
(2,'ս��Ƭ����ơ�����Ƭ������ս��ʷ���ش�����ж�Ϊ��ĵ�ӰƬ���ϳ�����ս��Ƭ���������ͣ�һ��'),
(3,'�������������������ĺϳƣ�ָ�����������ļ��ϣ�ȡ�������ʵĵ�һ���ֺ϶�Ϊһ��֮Ϊ����������');

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
(1,'����������4���վ�֮ս Avengers: Endgame','After the devastating event of "Avenger alliance 3: Infinite War", the universe was devastated by the action of crazy Titan. No matter what will happen to the future, the avenger alliance must rally again with the help of the remaining allies, in order to','2019��','null',1),
(2,'�˰�','���˰ۡ����ɻ����ֵܵ�Ӱ���޹�˾�ͱ�����ӡ���Ļ���ý���޹�˾��Ʒ����ѶӰҵ�Ļ��������޹�˾����������Ӱҵ���޹�˾�Ͱ���Ͱ�Ӱҵ�����������޹�˾���ϳ�Ʒ�����ݹܻ�ִ������־�ҡ�ŷ������ǧԴ�����䡢���롢�Ŵ���κ�����������������ݵ�ս�����ӰƬ [1]  ��
��Ƭȡ��1937��������ս�ڼ䣬������ʷ�ơ��˰�׳ʿ�����й��������������ս��88ʦ524�ŵ�һ����ǿӪ���������ݺ��ϵ����вֿ⡢����վ��Ĺ��� [2]  ��
��Ƭ��2020��8��21�����й��ڵ���ӳ [3]  ��','2020��','null',2),
(3,'�������','��������֡��������º���ִ��������ľ¡֮�顢�ϰ�ʯ����������Ҫ������һ��ԭ���ձ�������Ӱ [1]  ����Ʒ��2016��8��26�����ձ���ӳ���й��ڵ���2016��12��2����ӳ����Ʒ��������Ů��������������������Ѱ�ұ˴˵Ĺ��¡��й���½��2017��8��26��ȫ���ײ���','2016��','null',3),
(4,'��è','����è�����ɹ��鿥ִ�����ո߷��ӡ��౾ǧ�ġ��龮���������Ķ�����Ӱ����1988��4��16�����ձ���ӳ���������ư���2018��12��14�����й���ӳ��
��Ƭ�����˲ݱڴ��ɵ����Ӳݱھ�������סԺ�������Ųݱڸ�������������òݱ�÷�ص�����ס�Ĺ��¡�','1988��','null',3),
(5,'��߸֮ħͯ����','�������������һ�������޴�Ļ�Ԫ�飬Ԫʼ���𽫻�Ԫ�������������ħ�裬����Ͷ̥Ϊ�ˣ����ܷ���ʱ�ɿ����ã���ħ����ᵮ��ħ����Ϊ���˼䡣Ԫʼ����������������3������׽��ή�٣��ݻ�ħ�衣̫�����������������ڳ�������ҵĶ�����߸���ϡ�Ȼ���������������ħ�边Ȼ����������Ӧ������Ӣ�۵���߸ȴ���˻�����ħ�������Ƥ�������Ӳ�������߸ȴͽ��һ����Ӣ�۵��ġ�Ȼ��������˶���߸�����ͼ������ٵ����׵Ľ��٣���߸�Ƿ�����ע�������س�ħ��������ȥ�δ� [6]  ��','2019��7��26��','null',3);

CREATE TABLE `person` (
  `personID` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  `birthday` date NOT NULL,
  `photo` varchar(45) NOT NULL,
  PRIMARY KEY (`personID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `person`(`personID`,`name`,`role`,`birthday`,`photo`) values
(1,'С�޲��ء�����','iron man','1965-04-04','null');

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

