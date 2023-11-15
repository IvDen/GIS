# GIS
**WORK IN PROGRESS**
**Reactor**

**How to run**:
1. put you secrets files to these directories
   * `gis/secrets/`
     * `configurator`
       * `service_pass` //file with password for configurator
     * `db-postgres`
       * `root_pass` //file with password for db
     * `gateway`
       * `ca_pass` //file with password for certificate
       * `gateway.p12` //file with self signed certificate
         * example `keytool -genkeypair -alias gateway -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore gateway.p12 -validity 365 `
2. build project: from `/gis` directory run `maven clean install` 
3. run project: from `/gis` directory run `docker compose up`

**OpenAPI**(V3): `https://localhost:8443/openapi/webjars/swagger-ui/index.html`

