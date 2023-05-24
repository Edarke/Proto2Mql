# Proto2Mql

POC of generating query builder code from protobuf schema

## Before
```java
   Bson textSearch = Aggregates.search(
       SearchOperator.text(
           Arrays.asList(SearchPath.fieldPath("title"), SearchPath.fieldPath("foo")),
    List.of("Future"))
    .fuzzy(FuzzySearchOptions.fuzzySearchOptions().maxEdits(2).prefixLength(3)));

```

```javascript
{"$search": {"text": {"query": "Future", "path": ["title", "foo"], "fuzzy": {"maxEdits": 2, "prefixLength": 3}}}}
```


## After
```java
    Search search = Search.newBuilder()
        .setText(Text.newBuilder()
        .addPath(FieldPath.newBuilder().setPath("title"))
        .addPath(FieldPath.newBuilder().setPath("foo"))
        .addQuery("Future")
        .setFuzzy(FuzzyOption.newBuilder().setMaxEdits(2).setPrefixLength(3)))
        .build();
```

```javascript
{"$search": {"text": {"query": ["Future"], "path": ["title", "foo"], "fuzzy": {"max_edits": 2, "prefix_length": 3}}}}
```


## New Features

### Sort
Proto2Bson will transform a list of SortFields into a map of key-value pairs,
the FieldPath objects are unwrapped into a String,
and the SortOrder enum is mapped to +/-1 to match the API
```java
    Search searchSort = Search.newBuilder()
        .setText(Text.newBuilder()
        .addPath(FieldPath.newBuilder().setPath("title"))
        .addPath(FieldPath.newBuilder().setPath("foo"))
        .addQuery("Future"))
        .addSortBetaV1(SortField.newBuilder().setKey(FieldPath.newBuilder().setPath("title"))
          .setValue(SortOrder.ASC))
        .addSortBetaV1(SortField.newBuilder().setKey(FieldPath.newBuilder().setPath("_id"))
          .setValue(SortOrder.DESC))
        .build();
```

```javascript
{"$search": {"sort_beta_v1": {"title": "1", "_id": "-1"}, "text": {"query": ["Future"], "path": ["title", "foo"]}}}
```