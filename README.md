# noir3-basic

A basic noir3 web app to use as a starting point for real apps.

## Usage

If you use cake, substitute 'lein' with 'cake' below. Everything should work fine.

```bash
lein deps
lein run
```

To start the app from command line:
```lein ring server```

To start in nrepl:
```(require 'noir3-basic.server)
(use 'ring.server.standalone)
(serve noir3-basic.server/handler)
```

To create an uberwar that can be deployed to tomcat etc:
```lein ring uberwar```

## License

Copyright (C) 2013 Nathan Sullivan

Distributed under the Eclipse Public License, the same as Clojure.

