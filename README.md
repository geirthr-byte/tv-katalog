# TV-katalog (POC)

En egen katalog-/oppstartsapp for Google TV, navigerbar med fjernkontrollen.

Dette er foreløpig bare et **skjelett (POC)**. Målet er å bekrefte hele kjeden før vi
bygger den ekte katalogen:

1. Koden bygges til en APK automatisk i **GitHub Actions** (ingen Android Studio).
2. APK-en kan **sidelastes** på Google TV (`adb install`).
3. Appen **dukker opp / kan festes** i app-raden.
4. **Fjernkontrollen** (D-pad) flytter fokus mellom kortene, og «OK» velger.

Appen har ingen tredjepartsbibliotek og ingen nettverk – bare noen fokuserbare kort.

## Bygge

Hver push til `main` kjører arbeidsflyten **Bygg APK**. Den ferdige APK-en ligger som
et artefakt (`tvkatalog-debug-apk`) under kjøringen i fanen **Actions**.

## Installere på Google TV

```
adb connect <TV-ens IP>
adb install -r tvkatalog-debug.apk
```

Deretter: finn «TV-katalog» i app-oversikten og fest den i raden på startskjermen.

## Videre (etter bekreftet POC)

- Jellyfin + NRK som første ekte innhold (full API-tilgang).
- Metadata på tvers via TMDB/JustWatch for de kommersielle tjenestene.
- «Åpne eiende app», med søk-URI der det støttes, ellers vist søketekst.
