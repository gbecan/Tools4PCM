Automating the formalization of Product Comparison Matrices
==================

This project aim at formalization Product Comparison Matrices with model-based automated techniques.
Details about the evaluation are available in the [evaluation folder](evaluation).

### Authors
- Guillaume Bécan
- Nicolas Sannier
- Mathieu Acher
- Olivier Barais
- Arnaud Blouin
- Benoit Baudry


### Requirements

 * Scala 2.10
 * Eclipse 4.3 Kepler
 * GWT SDK 

### Structure of the project
- __PCMMetamodel__: metamodel of PCMs
- __VariabilityExtractor__: automated techniques for formalizing PCMs
- __CsvPCMParser__: CSV parser of PCM
- __WikipediaPCMParser__: MediaWiki parser of PCM that can connect to the English version of Wikipedia
- __pcmgwt__: web editor of PCMs
- __Index4PCM__: project to analyze the different tokens present in PCMs.
- __evaluation__: input PCMs, configuration files, generated models and detailed results
