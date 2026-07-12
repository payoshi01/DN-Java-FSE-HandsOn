# Git Hands-On

This folder contains the Git Hands-On exercises completed as part of the **Cognizant Digital Nurture 4.0 – Java Full Stack Engineer (FSE)** training program.

## Contents

```
Git-HandsOn
│
├── README.md
├── Git-HOL-1
│   └── welcome.txt
├── Git-HOL-2
│   ├── README.md
│   ├── notes.txt
│   └── .gitignore
├── Git-HOL-3
│   └── hello.txt
└── Git-HOL-4
    └── hello.xml
```

---

## Git HOL 1 – Git Configuration & Basic Commands

### Objectives
- Install and configure Git
- Set username and email
- Initialize a Git repository
- Add and commit files
- View repository status and commit history

### Commands Used

```bash
git --version
git config --global user.name "Your Name"
git config --global user.email "your-email@example.com"
git config --global --list
git init
git status
git add .
git commit -m "Initial Commit"
git log --oneline
```

---

## Git HOL 2 – Git Ignore

### Objectives

- Create a `.gitignore` file
- Ignore log files and build directories
- Verify ignored files
- Commit only required files

### Commands Used

```bash
git init
touch .gitignore
git status
git status --ignored
git add .
git commit -m "Added .gitignore"
```

### .gitignore

```text
*.log
build/
.DS_Store
.vscode/
```

---

## Git HOL 3 – Branching and Merging

### Objectives

- Create a new branch
- Switch between branches
- Modify files
- Merge branches
- Delete merged branch

### Commands Used

```bash
git branch GitNewBranch
git checkout GitNewBranch
git add .
git commit -m "Updated file"
git checkout master
git merge GitNewBranch
git branch -d GitNewBranch
git log --oneline --graph
```

---

## Git HOL 4 – Merge Conflict Resolution

### Objectives

- Create merge conflict
- Resolve conflict manually
- Complete merge
- Delete branch

### Commands Used

```bash
git branch GitWork
git checkout GitWork
git add .
git commit -m "Updated in GitWork"

git checkout master

git merge GitWork

git status

git add hello.xml

git commit -m "Resolved merge conflict"

git branch -d GitWork
```

---

## Git HOL 5 – Cleanup & Push to Remote Repository

### Objectives

- Verify repository status
- Verify configured remote repository
- Pull latest changes
- Push local commits to GitHub

### Commands Used

```bash
git status
git branch
git remote -v
git pull origin master
git push origin master
```

### Outcome

- Successfully synchronized the local repository with the remote GitHub repository.
- Verified that all commits were pushed successfully.
- Repository cleanup completed.

---

## Skills Learned

- Git Installation & Configuration
- Git Repository Initialization
- Tracking Files
- Staging and Committing Changes
- Viewing Commit History
- Using `.gitignore`
- Branch Creation & Switching
- Branch Merging
- Merge Conflict Resolution
- Working with Remote Repositories
- Pulling and Pushing Changes

---

## Technologies Used

- Git
- GitHub
- Visual Studio Code
- macOS Terminal

---

## Author

**Payoshi Gupta**

B.Tech Computer Science and Engineering

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer (FSE)
