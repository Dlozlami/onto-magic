# Onto-Magic

The ontology of Dlozi Lloyd Mthethwa, and the domains that sit on it. Permission slips is the first domain: an example of what you can do when YCYOR.

Dlozi is the authority on this work. Nothing here is filled in on her behalf. Anything undecided is marked `open` and stays that way until she settles it.

## Layout

| Path | Holds |
|---|---|
| `all.puml` | Class diagram of the core ontology. |
| `core/onto_magic_preamble.xml` | The ontology. Single source of truth for what exists and how it relates. |
| `core/java/ontomagic/` | The ontology as Java, one class per file. |
| `domains/permission-slips/` | The permission slips domain: its own preamble, site, narrative. |
| `source/` | Raw dictations and transcripts, untouched. |
| `assets/` | Images. |

## The ontology

Self inherits the ladder: The ALL, Monad, Atmic, Buddhic, Soul, Higher Self, Self. Only Creators can create Fields, and by extension realities. Souls are Creators.

A **Belief** holds one frequency unchanging, and carries an **amplitude**, which is how much energy it has. Thoughts reinforce a belief and raise its amplitude. An **Allowance** is a set of beliefs: what you are allowed to experience. A **Field** is the surface a reflection lands on. A **Reflection** is an Allowance reflected onto a Field, and reality is a Reflection held by Self.

Every belief is present at once, weighted by amplitude, composited like layers. Raising an amplitude adds nothing new; it shifts the mood of the whole. Nothing outside the Allowance can appear, however high an amplitude goes.

Inner being is reflected in reality.

## Metaphor is not ontology

The believer, and the paint and layers image, explain how the ontology behaves. They are narrative devices. They are never modelled as classes and never treated as ontology. They live in `narrative_devices` in the core preamble.

## Core before domain

A domain never redefines a core class; it uses it. If a domain needs a new core part, that is a change to the core preamble, not a local definition.

## Open

Be-Ness and how the formula is expressed. Where Mental sits on the ladder. Whether Self creating Fields is intended. Whether anything other than a Creator has a reflection. YCYOR.

## Working with this

Load `core/onto_magic_preamble.xml`, then the preamble of whichever domain you are working in, alongside `dlozi_ai_preamble.xml`. The preambles govern content, and the main preamble governs style and method. When the ontology does not cover something, ask. Do not fill the gap with general spiritual or manifestation teaching.

Version a preamble whenever the model changes, move the old one into its `archive/`, and say in `changes_from_v*` what moved and why.
