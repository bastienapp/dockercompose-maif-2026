# Installation du projet avec Docker

## Création des images

```bash
# création des images avec tous les logs
docker compose --progress=plain build --no-cache
```

## Montage des containers

```bash
# laisser ouvert le terminal le temps de l'exécution
docker compose up

# faire CTRL + C pour arrêter
```

## Overture du projet

Le projet est accessible sur l'adresse [http://localhost:3000](http://localhost:3000).

## Suppression des containers et du volume

```bash
docker compose down -v
```