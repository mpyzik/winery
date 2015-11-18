# winery
Repozytorium projektu "Winnica"

Tutaj powinny znaleźć się instrukcje dotyczące kompilacji i instalacji naszego systemu.

0. Wstępna konfiguracja

Upewnij się, że masz eclipse mars EE, plugin EGit do eclipse, maven-3.3.3, jdk 1.8.
Dodaj w eclipsie nowy, istniejący projekt do workspace'a - czyli nasze repo.
Nastaw poprawnie zmienną środowiskową JAVA_HOME (sprawdź, odpalając mvn -v).
Odpal mvn eclipse:eclipse, to może trochę potrwać.
Z konsoli można skompilować za pomocą mvn compile, ale raczej kompilujcie z eclipse, mamy XXI wiek. ;)

1. Instrukcja użytkowania gita

W folderze, w którym będziemy trzymać pliki gita:
	git clone git@github.com:mpyzik/winery.git

Po przeniesieniu wcześniej utworzonych plików do utworzonego folderu "winery"
	git add .

Aby przygotować commita:
	git commit -m "Tekst z komentarzem"

Aby wysłać commita:
	git push

Aby ściągnąć pliki z repozytorium:
	git pull
