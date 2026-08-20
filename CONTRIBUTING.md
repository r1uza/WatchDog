# Contributing to WATCHDOG Open Core

Thanks for your interest in contributing.

## Scope

This repository accepts contributions that fit the Open Core boundary:

- Platform-neutral domain logic
- Documentation and verification tooling
- Tests for public modules

Out of scope:

- Proprietary enterprise features
- Secrets or private infrastructure definitions
- Committed binary artifacts

## Development Guidelines

1. Keep module boundaries explicit.
2. Update related `module.json` metadata only when needed.
3. Keep changes focused and small.
4. Include tests when behavior changes.
5. Update Open Core docs when architecture or provenance changes.

## Pull Request Process

1. Open an issue (bug or feature) if there is no existing discussion.
2. Create a branch with a descriptive name.
3. Submit a PR using the provided template.
4. Ensure checks are green.
5. Request review from CODEOWNERS.

## Commit Hygiene

Recommended commit prefix examples:

- `docs:` documentation changes
- `fix:` bug fixes
- `feat:` new capability
- `refactor:` code restructuring without behavior change
- `test:` tests only

## Legal

By contributing, you agree that your contribution is licensed under the repository license.
