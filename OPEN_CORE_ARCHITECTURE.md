# WATCHDOG Open Core Architecture

## Purpose

This document defines the public Open Core architecture exposed in this repository.

## Layering Model

WATCHDOG Open Core follows a layered modular architecture:

1. Foundation and core semantics
	- `foundation`, `core`, `identity`
2. Domain services
	- `watch`, `health`, `diagnostics`, `integrity`, `resilience`, `security`, `resource-governance`, `settings`, `notification`, `backup`, `migration`, `lifecycle`, `journal`, `observation`, `observability`, `device`, `alert`, `snapshot`, `application`, `release`, `distribution`, `verification-e2e`
3. Presentation projection modules
	- `presentation-*` modules

## Open Core Boundary

Boundary rule:

- Code in this repository must stay platform-neutral and reusable.
- Platform-bound adapters (for example Android runtime, OEM integrations, enterprise connectors) are out of scope unless represented only as neutral contracts.

Current module metadata reports `platform_boundary: false` across all published module manifests in this snapshot.

## Module Contract Conventions

Each module provides:

- A manifest file `module.json` with `module`, `owning_cycle`, and `platform_boundary`.
- Domain and projection types under `src/main/java/dev/sfstudio/watchdog/...`.

Modules should expose deterministic behavior and avoid side effects tied to proprietary runtime infrastructure.

## Security and Integrity Posture

- No signing secrets are committed in `distribution/distribution-manifest.json`.
- Integrity can be independently verified through `OPEN_CORE_MANIFEST.sha256`.
- Runtime and release metadata are accompanied by SBOM data in `distribution/sbom.json`.

## Release Artifacts in Scope

Published source artifacts include:

- Module source trees
- Metadata manifests (`module.json`, distribution manifest, SBOM)
- Open Core verification/provenance docs

Excluded release artifacts:

- Android binary outputs (`.apk`, `.aab`) not present in this repository snapshot.

## Evolution Rules

Architectural evolution in Open Core must:

- Maintain module-level separation of concerns.
- Keep public contracts stable or document breaking changes.
- Update provenance and report files for each release cut.
