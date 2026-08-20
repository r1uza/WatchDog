# Open Core Release Checklist

Use this checklist before publishing a new Open Core release.

## 1. Source Integrity

- [ ] Regenerate `OPEN_CORE_MANIFEST.sha256`
- [ ] Verify all hashes successfully
- [ ] Ensure no generated binaries are committed

## 2. Metadata Consistency

- [ ] Update `distribution/distribution-manifest.json` version fields
- [ ] Validate `distribution/sbom.json`
- [ ] Confirm `module.json` values are accurate for changed modules

## 3. Documentation

- [ ] Update `WATCHDOG_OPEN_CORE_REPORT.md`
- [ ] Update `OPEN_CORE_PROVENANCE.md`
- [ ] Update architecture/modules docs when boundaries change

## 4. Security and Compliance

- [ ] Run secret scanning
- [ ] Confirm `signing_secrets_in_repository` remains `false`
- [ ] Review dependency/security findings

## 5. GitHub Publication

- [ ] Confirm branch protection and required checks
- [ ] Confirm CODEOWNERS assignments are valid
- [ ] Tag release and publish release notes
