#!/usr/bin/env bash
mongod --dbpath data/db  --logpath data/log/$(date -d "today" +"%Y%m%d").log --fork&