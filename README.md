[![Build Status](https://travis-ci.org/adriens/cine-city-noumea-api.svg?branch=master)](https://travis-ci.org/adriens/cine-city-noumea-api) [![Dependency Status](https://beta.gemnasium.com/badges/github.com/adriens/cine-city-noumea-api.svg)](https://beta.gemnasium.com/projects/github.com/adriens/cine-city-noumea-api)

# cine-city-noumea-api

Implémentation rapide en Spring Boot 2.0 de l'API REST pour interagir avec http://www.cinecity.nc.
L'API utilise une SDK qui webcrawl le site du cinema. Voir https://github.com/adriens/cine-city-noumea-sdk pour utiliser
le JDK à d'autres fins.


# Endpoints

- `/` ou `/today` : films du jour
- `/contact` : donées de contact du cinéma
- `/bests` : les 5 meilleurs films notés par ce cinéma
- `/worsts` : les 5 pires films notés par ce cinéma
- `/film/{filmId}` : (tous) les détails du film dont le num Cinecity est {filmId}

# Heroku

Le service est déployé en mode free sur [Heroku](), les urls sont les suivantes :

```
https://cine-city-nc.herokuapp.com/
https://cine-city-nc.herokuapp.com/today
https://cine-city-nc.herokuapp.com/contact
https://cine-city-nc.herokuapp.com/bests
https://cine-city-nc.herokuapp.com/worsts
https://cine-city-nc.herokuapp.com/film/{filmId}
```

Uxemple ci-dessous :

https://cine-city-nc.herokuapp.com/film/50218
