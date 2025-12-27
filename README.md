# Muslim App 🕌✨

## Description du Projet
"Muslim App" est une application mobile moderne et complète, développée avec Flutter et Firebase, conçue pour accompagner les musulmans dans leur quotidien. Elle offre un ensemble de fonctionnalités essentielles, allant des horaires de prière précis à la direction de la Qibla, en passant par des rappels religieux dynamiques. Le projet met en avant un design ultra-moderne avec des effets de "glassmorphism" et des animations fluides.

## Fonctionnalités Clés

*   **Authentification Sécurisée (Firebase Auth) :**
    *   Création de compte (Inscription) et connexion (Login) par email et mot de passe.
    *   Gestion de session utilisateur.
*   **Horaires de Prière Dynamiques :**
    *   Calcul des heures de prière (`Fajr`, `Lever du soleil`, `Dhuhr`, `Asr`, `Maghrib`, `Isha`).
    *   Utilisation de la géolocalisation (GPS) pour des horaires précis.
    *   Fallback automatique sur les coordonnées de Casablanca (Maroc) avec la méthode de calcul du Ministère des Habous (Fajr 19°, Isha 17°) en cas d'indisponibilité du GPS.
    *   Affichage clair de la prochaine prière et un décompte.
    *   Interface utilisateur moderne avec des éléments visuels attrayants.
*   **Direction de la Qibla :**
    *   Utilisation du capteur de boussole de l'appareil pour afficher la direction de la Kaaba à la Mecque.
    *   Indication visuelle claire de l'angle.
*   **Adhkar (Invocations) Dynamiques (Cloud Firestore) :**
    *   Liste d'invocations interactives avec un compteur (Tasbih).
    *   Les Adhkar sont chargés dynamiquement depuis Cloud Firestore, permettant une mise à jour facile du contenu.
*   **Conseils & Rappels Dynamiques (Cloud Firestore) :**
    *   Section dédiée aux versets coraniques, hadiths et rappels bénéfiques.
    *   Le contenu est également géré via Cloud Firestore, offrant flexibilité et évolutivité.
*   **Design Ultra-Moderne :**
    *   Interface utilisateur épurée avec des dégradés de couleurs profondes.
    *   Effets de "Glassmorphism" (verre dépoli) sur les cartes et les éléments interactifs.
    *   Animations fluides lors de l'affichage des listes et des transitions.
*   **Navigation Intuitive :**
    *   Barre de navigation inférieure (`NavigationBar`) pour un accès rapide aux différentes sections de l'application.

## Technologies Utilisées

*   **Framework :** Flutter 3.x
*   **Langage :** Dart
*   **Backend :** Firebase
    *   `firebase_auth` : Authentification utilisateur.
    *   `cloud_firestore` : Base de données NoSQL pour Adhkar et Conseils.
    *   `firebase_core` : Initialisation de Firebase.
*   **Packages :**
    *   `adhan` : Calcul des horaires de prière.
    *   `geolocator` : Accès à la géolocalisation GPS.
    *   `flutter_compass` : Accès au capteur de boussole.
    *   `flutter_animate` : Animations fluides et déclaratives.
    *   `google_fonts` : Polices d'écriture personnalisées.
    *   `intl` : Internationalisation et formatage des dates.
    *   `permission_handler` : Gestion des permissions (GPS).

## Installation et Lancement du Projet

Suivez ces étapes pour configurer et exécuter l'application sur votre machine locale.

### Prérequis

*   [Flutter SDK](https://flutter.dev/docs/get-started/install) installé et configuré.
*   [Android Studio](https://developer.android.com/studio) avec le SDK Android et les outils de ligne de commande.
*   Un émulateur Android configuré ou un appareil Android physique avec le débogage USB activé.
*   Un projet Firebase créé et configuré.

### Configuration Firebase

1.  **Créez un Projet Firebase :** Allez sur la [Console Firebase](https://console.firebase.google.com/) et créez un nouveau projet.
2.  **Configurez l'Authentification :** Dans Firebase, activez la méthode de connexion "Email/Mot de passe" sous la section "Authentication".
3.  **Configurez Firestore Database :** Créez une base de données Firestore en "mode test" (pour faciliter le développement) et créez deux collections :
    *   `adhkar` (avec les champs `arabic`, `translation`, `target`)
    *   `conseils` (avec les champs `title`, `content`)
4.  **Téléchargez `google-services.json` :** Depuis les paramètres de votre projet Firebase, ajoutez une application Android et téléchargez le fichier `google-services.json`. Placez ce fichier dans le répertoire `android/app/` de votre projet Flutter.
5.  **Mettez à jour les fichiers Gradle :**
    *   Ouvrez `android/build.gradle.kts` et ajoutez `classpath("com.google.gms:google-services:4.4.2")` dans le bloc `dependencies` du `buildscript`.
    *   Ouvrez `android/app/build.gradle.kts` et ajoutez `id("com.google.gms.google-services")` dans le bloc `plugins`.
    *   **Important :** Assurez-vous que l'`applicationId` dans `android/app/build.gradle.kts` correspond au `package_name` dans votre `google-services.json`.

### Lancement

1.  **Clonez le dépôt :**
    ```bash
    git clone https://github.com/votre_utilisateur/muslim_app.git
    cd muslim_app
    ```
2.  **Installez les dépendances Flutter :**
    ```bash
    flutter pub get
    ```
3.  **Vérifiez l'environnement :**
    ```bash
    flutter doctor
    ```
    Assurez-vous que la section "Android toolchain" est ✅ (verte).
4.  **Démarrez un émulateur ou connectez un appareil physique.**
5.  **Lancez l'application :**
    ```bash
    flutter run
    ```
    Si l'application ne démarre pas sur la page de Login, faites un "Hot Restart" (`R` dans le terminal).

## Screenshots
*(Ajoutez ici vos captures d'écran de l'application : Écran de connexion, Horaires de prière, Qibla, Adhkar, Conseils)*

| Écran de Connexion | Horaires de Prière | Adhkar | Conseils |
| :----------------: | :----------------: | :----: | :------: |
|    <img width="469" height="1031" alt="image" src="https://github.com/user-attachments/assets/e9be55e6-6463-4214-8ecf-4b6ad48bd664" />
)    |    <img width="485" height="1035" alt="image" src="https://github.com/user-attachments/assets/edc3924b-6bf4-44fd-ad42-522ef46d6d1e" />
     | <img width="491" height="1025" alt="image" src="https://github.com/user-attachments/assets/38889761-5cad-487a-bee4-7237c4fb79ef" />
 | <img width="482" height="1033" alt="image" src="https://github.com/user-attachments/assets/141bb54d-bff9-4bcf-a442-537aeb58b9c2" />
 |

*(N'oubliez pas de créer un dossier `screenshots` dans votre projet GitHub et d'y placer vos images !)*

## Utilisation

*   **Connexion :** Au démarrage, créez un compte ou utilisez un compte existant.
*   **Horaires de Prière :** L'application tentera de détecter votre position. Si le GPS est désactivé ou sur un émulateur, les heures de Casablanca seront utilisées.
*   **Navigation :** Utilisez la barre de navigation en bas pour passer entre les différentes sections.
*   **Adhkar :** Cliquez sur chaque carte de Dhikr pour incrémenter le compteur.
*   **Remplir la base de données (pour le développement) :** Un bouton temporaire "ADMIN: Remplir la base de données" a été inclus dans l'écran de Login (`login_screen.dart`). **Il est recommandé de le retirer après le remplissage initial de votre base de données Firestore pour la production.**

## Contribution
Les contributions sont les bienvenues ! Si vous avez des suggestions d'amélioration ou des corrections de bugs, n'hésitez pas à ouvrir une "issue" ou à soumettre une "pull request".

## Licence
Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.

---


