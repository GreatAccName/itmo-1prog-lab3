# TASK<br>
Медуница еще долго разыскивала Ворчуна с похищенной им одеждой, и, пока шли поиски, Ворчун сидел, притаившись, в зарослях лопуха. Хотя сидение в лопухах не такое уж веселое дело, но Ворчун был вне себя от радости, что вырвался на свободу. Он с наслаждением глядел на прозрачное синее небо, на свежую зеленую травку. На лице его даже появилась улыбка. Он дал сам себе клятву никогда в жизни не ворчать больше и быть довольным всем на свете, если только не попадет снова в больницу.<br>
<br>
# REQUIREMENTS<br>
- 2 interfaces<br>
- 1 abstract class<br>
- 1 enum<br>
- equals()<br>
- toString()<br>
- hashCode()<br>

# PREDICTED OUTPUT<br>
Медуница занимает должность: врач в больнице BloodyHospital.<br>
Статус Медуницы: чувствует легкую безмятежность.<br>
Ворчун занимает должность: первач в ИТМО на ИВТ.<br>
Статус Ворчуна: ворчит, недосыпает, страдает меланхолией.<br>
Ворчун прибывает в больницу BloodyHospital.<br>
Медуница проводит осмотр персоны Ворчун.<br>
Медуница диагностирует меланхолию у персоны Ворчун.<br>
Медуница позаботится о персоне Ворчун.<br>
Новая должность Ворчуна: пациент.<br>
<br>
Ворчун решается на побег.<br>
Ворчун крадет одежду.<br>
Ворчун прибывает в лесочек.<br>
Медуница начинает поиск персоны Ворчун.<br>
Новый статус Медуницы: тревога оттого, что сбежавшего может укусить волчок за бочок.<br>
Медуница прибывает в лесочек.<br>
Ворчун прибывает в заросли лопуха.<br>
Ворчун присаживается и притаивается.<br>
Ворчун с наслаждением глядит на свежую зеленую траву и на прозрачное синее небо.<br>
Новый статус Ворчуна: вне себя от радости, даже улыбается.<br>
<br>
Ворчун пообещал себе никогда не ворчать и быть довольным всем на свете, если только вновь не окажется в больнице BloodyHospital.<br>
[case 1: 50%]<br>
Медуница после долгих поисков все-таки нашла персону Ворчун.<br>
	[case 1.1: 50%]<br>
	Медуница отпускает персону Ворчун.<br>
	Медуница прекращает заботу о персоне Ворчун.<br>
	Медуница прибывает в больницу BloodyHospital.<br>
	Ворчун прибывает в ИТМО на ИВТ.<br>
	Новая должность Ворчуна: стрессоустойчивый первач.<br>
	[case 1.2: 50%]<br>
	Медуница забирает персону Ворчун в больницу BloodyHospital.<br>
		[provavility: 75%]<br>{<br>
		Медуница ощущает сопротивление от персоны Ворчун.<br>
		Медуница всаживает транквилизатор в персону Ворчун.<br>}<br>
	Медуница прибывает в больницу BloodyHospital.<br>
	Новый статус Медуницы: чувствует легкую безмятежность.<br>
	Ворчун прибывает в больницу BloodyHospital.<br>
	Новый статус Ворчуна: ворчит, недосыпает, страдает меланхолией.<br>
[case 2: 50%]<br>
Медуница бросила поиски персоны Ворчун.<br>
Медуница прекращает заботу о персоне Ворчун.<br>
Медуница прибывает в больницу BloodyHospital.<br>
	[provavility: 75%]<br>{<br>
	Медуница решается на отдых в Египте.<br>
	Новый статус Медуницы: хочет красивый загар.<br>
	Медуница прибывает в Египет.<br>}<br>
Ворчун прибывает в ИТМО на ИВТ.<br>
Новая должность Ворчуна: стрессоустойчивый первач.<br>

# DEVELOPMENT<br>
## BASIC CLASSES<br>
Person {abstract}<br>
#name: String<br>
#job: Job<br>
#status: Status<br>
#place: Place<br>
+Person(name, job, status, place)<br>
+getResist(person)<br>
+getName(): String<br>
+getJob(): Job<br>
+getStatus(): Status<br>
+getPlace(): Place<br>
+setJob() {abstract}<br>
+setStatus() {abstract}<br>
+setPlace() {abstract}<br>
<br>
Detective extends Person {abstract}<br>
...<br>
#fugitive: Person<br>
...<br>
+Detective(name, job, status, place)<br>
+getFugitive(): Person<br>
+inSearch(): boolean<br>
+startSearch(person) {abstract}<br>
+stopSearch() {abstract}<br>
***
interface Detectivable<br>
+take(person, place)<br>
+letGo()<br>
+tranquilize(person)<br>
<br>
interface Fugitivable<br>
+escapeDecision()<br>
+stealClothes()<br>
+hide()<br>
***
Medunica extends Detective implements Detectivable<br>
...<br>
-care: Person<br>
...<br>
+Medunica(job, status, place)<br>
+inspection(person)<br>
+takeCare(person)<br>
+stopCare()<br>
+vacation(place)<br>
<br>
Vorchun extends Person implements Fugitivable<br>
...<br>
+Vorchun(job, status, place)<br>
+look()<br>
+promise()<br>

## ENUMS<br>
Job<br>
Status<br>
Place<br>
