[![Build Status](https://travis-ci.org/adriens/cine-city-noumea-api.svg?branch=master)](https://travis-ci.org/adriens/cine-city-noumea-api) [![Dependency Status](https://beta.gemnasium.com/badges/github.com/adriens/cine-city-noumea-api.svg)](https://beta.gemnasium.com/projects/github.com/adriens/cine-city-noumea-api)

# cine-city-noumea-api

Implémentation rapide en Spring Boot 2.0 de l'API REST pour interagir avec http://www.cinecity.nc.


# Endpoints

- `/` ou `/today` : films du jour
- `/contact` : donées de contact du cinéma
- `/bests` : les 20 meilleurs films notés par ce cinéma
- `/worsts` : les 20 pires films notés par ce cinéma
- `/film/{filmId}` : les détails du film dont le num Cinecity est {filmId}

