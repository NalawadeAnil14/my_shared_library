package com.company 

class GitUtils {

    def steps 

    GitUtils(steps) {
        this.steps = steps
    }

    String getCurrentBranch() {
        return steps.sh(script: 'git branch --show-current', returnStdout: true).trim()
    }

    String getCurrentCommitHash() {
        return steps.sh(script: 'git rev-parse HEAD', returnStdout: true).trim()
    }

    String getCurrentCommitShortHash() {
        return steps.sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
    }

    String getCurrentCommitMessage() {
        return steps.sh(script: 'git log -1 --pretty=%B', returnStdout: true).trim()
    }

    String getCurrentCommitAuthor() {
        return steps.sh(script: 'git log -1 --pretty=%an', returnStdout: true).trim()
    }


    // Return Map with commit details
    Map getCurrentCommitDetails() {
        def commitDetails = [:]
        commitDetails['hash'] = getCurrentCommitHash()
        commitDetails['shortHash'] = getCurrentCommitShortHash()
        commitDetails['message'] = getCurrentCommitMessage()
        commitDetails['author'] = getCurrentCommitAuthor()
        commitDetails['branch'] = getCurrentBranch()
        return commitDetails
    }