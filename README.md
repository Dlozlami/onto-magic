# onto-magic

An ontology expressed as machine-readable XML, a class model, and generated reading material. The XML preambles are the source of truth; the Java and PlantUML express the same model in a form you can compile and draw; the HTML site renders the preambles for a human reader.

Author: Dlozi Lloyd Mthethwa.

## Repository layout

```
onto-magic/
├── README.md
├── all.puml                          class diagram of the core ontology
├── core/
│   ├── onto_magic_preamble.xml       the ontology
│   └── java/ontomagic/               the ontology as Java, one class per file
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
| `Belief` | Holds one frequency unchanging. Carries an amplitude. |
| `Frequency`, `Thought` | What a belief holds, and what reinforces it. |
| `Allowance` | A set of beliefs: what you are allowed to experience. |
| `Field` | The surface a Reflection lands on. |
| `Reflection` | An Allowance reflected onto a Field. |
| `Mental` | Mind, consciousness, awareness, thinking, cognition. Placement open. |

Every belief in the Allowance is present at once, weighted by its amplitude, composited like layers. Raising an amplitude changes the proportions, not the contents. Reality holds references rather than copies, so a push, a pop or a reinforcement shows immediately.

## Status markers

Every item in a preamble carries one: `settled`, `open`, `deferred` or `critical`. Open items are not to be filled in by anyone but the author.

## Usage

The preambles are loaded as context for AI-assisted work, core first, then the domain:

```
core/onto_magic_preamble.xml
domains/<domain>/preamble/<domain>_preamble.xml
```

To read the ontology as a page, open `domains/<domain>/site/*.html` in a browser. It renders the embedded preambles and accepts an updated core or domain XML through the load button.

To draw the class diagram:

```bash
plantuml all.puml
```

To compile the model:

```bash
javac -d build core/java/ontomagic/*.java
```

## Versioning

A preamble carries `version` and `date` on its root element. On a change to the model, increment the version, move the previous file into `preamble/archive/`, and record what moved in a `changes_from_v*` element. Domains declare what they depend on with a `requires` element.

## Adding a domain

Copy the layout above under `domains/`, declare `requires` on the core preamble, and define only what is specific to that domain. Core classes are used, never redefined.