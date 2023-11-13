# GIS
WORK IN PROGRESS

1. put you secrets files to these directories
   * `gis/secrets/`
     * `configurator`
       * `service_pass` //file with password for configurator
     * `db-postgres`
       * `root_pass` //file with password for db
     * `gateway`
       * `ca_pass` //file with password for certificate
       * `gateway.p12` //file with self signed certificate
2. build project: from `/gis` directory run `maven clean install` 
3. run project: from `/gis` directory run `docker compose up`
