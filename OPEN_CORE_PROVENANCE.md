# WATCHDOG Open Core Provenance

## Scope

This document captures provenance and verification expectations for the public Open Core repository snapshot.

## Source Provenance

- Repository snapshot root: `WATCHDOG_open_core_0.33.0`
- Module metadata: `*/module.json`
- Distribution metadata:
  - `distribution/distribution-manifest.json`
  - `distribution/sbom.json`
- Integrity manifest:
  - `OPEN_CORE_MANIFEST.sha256`

The distribution manifest currently reports:

- `version`: `0.32.0`
- `channel`: `PRODUCTION`
- `signing_secrets_in_repository`: `false`
- Android binaries: `REQUIRES_ANDROID_SDK_BUILD` (not committed)

## Reproducibility Signals

- Deterministic file-level hash manifest exists (`OPEN_CORE_MANIFEST.sha256`).
- Module boundaries are explicitly declared per module (`module.json`).
- SBOM exists for platform/runtime components (`distribution/sbom.json`).

## Verification Procedure

Run from repository root:

1. Verify SHA256 manifest (PowerShell example):
	- Parse each line from `OPEN_CORE_MANIFEST.sha256`
	- Recompute hash for corresponding file
	- Confirm equality for all entries
2. Validate all JSON manifests:
	- `Get-ChildItem -Recurse -Filter module.json`
	- `distribution/distribution-manifest.json`
	- `distribution/sbom.json`
3. Validate Open Core policy constraints:
	- No committed credentials/secrets
	- No committed binary release artifacts
	- No proprietary module content

## Chain of Trust

- Manifest hash file anchors file integrity at publication time.
- Public governance docs (`LICENSE`, `SECURITY.md`, `CONTRIBUTING.md`) define contribution and reporting channels.

## Maintainer Actions per Release

- Update provenance document for each new release tag.
- Regenerate and commit `OPEN_CORE_MANIFEST.sha256`.
- Update Open Core report status in `WATCHDOG_OPEN_CORE_REPORT.md`.
