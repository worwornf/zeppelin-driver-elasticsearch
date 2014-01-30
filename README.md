zeppelin-driver-elasticsearch
=============================

[Zeppelin](http://zeppelin-project.org) Elasticsearch Driver

### Build

```
mvn package
```

or

```
gradle build
```

As a result, _elasticsearch_ dir will be created under target directory.

(gradle generate driver under build/libs directory)

### Install driver

copy _elasticsearch_ dir under target directory to Zeppelin driver directory.

### Configuration

in zeppelin.drivers property, add driver uri like

```
es:elasticsearch:com.nflabs.zeppelin.driver.elasticsearch.ElasticsearchDriver:es://[ES_ADDR]:9200
```
