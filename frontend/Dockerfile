FROM node:24.12.0-alpine3.23 AS live26build
WORKDIR /app
# copie uniquement la conf pour installer les dépendances
COPY package*.json ./
# installe les dépendances
# pas besoin d'installer ng cli (il était dans le package.json)

# installe les dépendances, a besoin du fichier de configuration pour Nexus Sonatype
RUN --mount=type=secret,id=npmrc,target=/root/.npmrc npm install --verbose

# copie l'ensemble des fichiers du projet dans l'image
COPY . .

# commande lancée par le container
RUN npm run build

# ici on pourrait lancer des tests

# rend accessible le build avec nginx
FROM nginx:stable-alpine3.23 AS web
COPY --from=live26build /app/dist/frontend/browser /usr/share/nginx/html
COPY config/nginx.conf /etc/nginx/nginx.conf
USER nginx
# Expose port 80
EXPOSE 80