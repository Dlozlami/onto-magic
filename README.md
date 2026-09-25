# onto-magic

An ontology expressed as machine-readable XML, a class model, and generated reading material. The XML preambles are the source of truth; the Java and PlantUML express the same model in a form you can compile and draw; the HTML site renders the preambles for a human reader.

Author: Dlozi Lloyd Mthethwa.

## Tech stack

| Layer | Tool |
|---|---|
| Source of truth | XML preambles |
| Model | Java 21 |
| Build | Gradle (Kotlin DSL), via the wrapper |
| Diagram | PlantUML |
| Reader | HTML, CSS and vanilla JavaScript, no framework, no build step |

## Requirements

- JDK 21 or newer (`java -version`, `javac -version`)
- Nothing else. Gradle arrives through the wrapper.

## Clone and run

```bash
git clone <repo-url> onto-magic
cd onto-magic
./gradlew build
./gradlew playground
```

The first run downloads the Gradle distribution the wrapper pins, so it takes a few minutes. After that it is seconds.

If the wrapper is missing, install Gradle once and generate it:

```bash
sudo snap install gradle --classic   # apt ships a version too old for Kotlin DSL
gradle wrapper
```

## Repository layout

```
onto-magic/
├── README.md
├── build.gradle.kts
├── settings.gradle.kts
├── all.puml                          class diagram of the core ontology
├── src/
│   ├── main/java/ontomagic/          the ontology
│   └── playground/java/ontomagic/    throwaway code that exercises it
├── core/
│   └── onto_magic_preamble.xml       the ontology, as source of truth
├── domains/
│   └── <domain>/                     a domain built on the core
│       ├── README.md
│       ├── preamble/
│       │   ├── <domain>_preamble.xml
│       │   └── archive/              superseded versions
│       ├── site/                     rendered reader
│       └── narrative/                prose and teaching material
├── source/                           raw dictations and transcripts
└── assets/                           images
```

## Model

| Class | Role |
|---|---|
| `TheAll` | Be-Ness. Top of the ladder. Open. |
| `Monad`, `Atmic`, `Buddhic` | Rungs. Deferred. |
| `Creator` | Interface. Creates Fields, and by extension realities. |
| `Soul` | A Creator. |
| `HigherSelf` | Rung between Soul and Self. |
| `Self` | Holds an Allowance, a Field, and reality. |
| `Frequency` | The substrate. Everything is vibration. |
| `Belief` | Manages frequencies and their amplitude. |
| `Thought` | Frequencies, appearing as a thought. Reinforces a belief. |
| `Allowance` | A group of beliefs. Append-only: beliefs are forever. |
| `Field` | The surface a Reflection lands on. |
| `Reflection` | An Allowance reflected onto a Field. Reality. |
| `Mental` | Mind, consciousness, awareness, thinking, cognition. Placement open. |

Every belief composites at once, weighted by its amplitude, including the ones at zero. Raising an amplitude changes the proportions, not the contents. Reflection holds references rather than copies, so a change shows immediately.

## Gradle tasks

| Task | Does |
|---|---|
| `./gradlew build` | Compiles the ontology and the playground. |
| `./gradlew playground` | Runs `ontomagic.Playground`. |
| `./gradlew clean` | Deletes `build/`. |

The playground is a separate source set: it can see the ontology, the ontology cannot see it.

## Diagram

```bash
plantuml all.puml
```

## Status markers

Every item in a preamble carries one: `settled`, `open`, `deferred` or `critical`. Open items are not to be filled in by anyone but the author.

## Versioning

A preamble carries `version` and `date` on its root element. On a change to the model, increment the version, move the previous file into `preamble/archive/`, and record what moved in a `changes_from_v*` element. Domains declare what they depend on with a `requires` element.

## Adding a domain

Copy the layout above under `domains/`, declare `requires` on the core preamble, and define only what is specific to that domain. Core classes are used, never redefined.
