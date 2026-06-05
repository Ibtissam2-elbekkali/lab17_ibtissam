#  Receiver Demo (Lab 17) - Par Ibtissam

Une application Android simple et esthétique démontrant l'utilisation des **Broadcast Receivers** dans Android. Ce projet permet d'intercepter des événements systèmes et des événements personnalisés en temps réel.

##  Fonctionnalités implémentées

-  **Receiver Dynamique** : Intercepte les changements d'état du **Mode Avion** (activé/désactivé) uniquement lorsque l'application est au premier plan, afin de préserver la batterie.
-  **Receiver Statique** : Détecte le redémarrage du téléphone (`BOOT_COMPLETED`) en arrière-plan (déclaré dans le Manifest).
-  **Custom Broadcast** : Envoi et réception d'un événement personnalisé (`CUSTOM_EVENT_IBTISSAM`) au sein de l'application.
-  **Interface Utilisateur (UI)** : Design moderne et esthétique (Material Design) avec une palette de couleurs personnalisée.

##  Technologies utilisées

- **Langage** : Java
- **UI** : XML (LinearLayout, CardView, MaterialButton)
- **Composants Android** : `BroadcastReceiver`, `IntentFilter`, `Context`

##  Comment tester l'application ?

1. Clonez ce repository sur votre machine.
2. Ouvrez le projet avec **Android Studio**.
3. Lancez l'application sur un émulateur ou un téléphone physique.
4. **Pour tester le Mode Avion** : Cliquez sur "Activer Receiver Avion", puis activez/désactivez le mode avion depuis les paramètres de votre téléphone. Un Toast apparaîtra.
5. **Pour tester l'événement personnalisé** : Cliquez simplement sur "Envoyer Custom Broadcast".

---
*Projet réalisé dans le cadre du Lab 17 sur les Broadcast Receivers.*
