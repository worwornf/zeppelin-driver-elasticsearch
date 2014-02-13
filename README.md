zeppelin-driver-elasticsearch
=============================

[![Build Status](https://travis-ci.org/NFLabs/zeppelin-driver-elasticsearch.png?branch=master)](https://travis-ci.org/NFLabs/zeppelin-driver-elasticsearch)

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

copy the generated _elasticsearch_ dir in Zeppelin project, under driver directory.

### Configuration

in zeppelin.drivers property, add driver uri like [NAME]:es://[ES_ADDR]:[PORT]

```
es:es://localhost:9200
```
