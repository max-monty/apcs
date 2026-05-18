# Vibe Coding

A 4-class module after the AP exam, plus a wrap-up day. You'll learn to build software with AI as your partner, then ship a real web app to the internet.

By the end of class 4 you'll have:
- A live URL anyone can visit
- That project on your public GitHub
- Learned the prompt → run → iterate → commit → push loop of modern AI-driven software development
- Something you'd actually send to someone (hopefully!)

---

## The schedule

| Class | Part        | Focus                                | What you leave with                                  |
| ----- | ----------- | ------------------------------------ | ---------------------------------------------------- |
| 1     | **Setup**   | Accounts + tools + your first deploy | A "Hello, [your name]" page live at your own URL     |
| 2     | **Build**   | Pick + plan + scaffold               | A brief, a starter version of your project, deployed |
| 3     | **Build**   | Build day                            | Must-haves working                                   |
| 4     | **Ship**    | Polish + final deploy                | Demo-ready: named, polished, README'd, submitted     |


---

## How to think about this

You're not coding the way you did all year in AP CS. You're working *with* an AI as a partner.

**The mental model:** You are a **product manager**. The AI is the **engineer**. You bring:
- What you're building (the goal)
- Who it's for (the user)
- What "good" looks like (the bar)
- The product judgment to say "that's not what I wanted"

The AI brings everything else: the language, the framework, the file structure, the syntax, the libraries.

The single most important rule of vibe coding: describe outcomes, and provide guidance regarding implementations when necessary. Tell the AI what users should see, feel, and do. Work together to figure out *how*.

---

## Part 1 — Setup (Class 1)

The most important class of the module. **One goal:** every student leaves with a public URL that says "Hello, [your name]" — and every push updates it in ~30 seconds.

### Step 1 — Accounts

Three accounts, one email. Use a **personal** email (you'll keep this past graduation).

1. **GitHub** — [github.com](https://github.com) → Sign up. Pick a username you'd be okay seeing on a résumé (your name, not `xX_dragon420_Xx`). This is the URL of your portfolio for the next decade. Verify your email.
2. **Cursor** — [cursor.com](https://cursor.com) → Download → install. Open it. Sign in with the **same email** as GitHub. Visit [cursor.com/students](https://cursor.com/students) and use your `.edu` email for a free year of Pro.
3. **Vercel** — [vercel.com](https://vercel.com) → Sign up → **Continue with GitHub** (don't make a new account). Authorize it.

### Step 2 — Your first live URL

We'll all do these together.

1. On github.com → **New repo** → name it `my-vibe-site` → Public → ✓ "Add a README" → Create.
2. In Cursor: `Cmd+Shift+P` → type `Git: Clone` → paste your repo URL → pick a folder.
3. Open the chat (`Cmd+L`) and paste:

   > Create an `index.html` that says "Hello, [my name]" in big text on a fun gradient background. Centered, modern look. Plain HTML/CSS in one file.

   Replace `[my name]` with your actual name. Hit enter. Accept the changes.

4. Double-click `index.html` from your file explorer to open it in a browser. Looks good? ✓
5. **Push it.** Cursor's Source Control sidebar (left edge) → hover the changed file → `+` to stage → type a commit message like `first page` → click ✓ Commit → click ⋯ → Push. First time Cursor will pop open a browser to log into GitHub — accept.
6. **Deploy it.** vercel.com → Add New → Project → Import `my-vibe-site` → Deploy. Wait ~30 sec. Click the URL Vercel gives you.

   **That's your site, on the internet.** Send it to someone.
### Step 3 — Feel the loop 

Run the loop once so it clicks. In Cursor:

> Add a button that, when clicked, changes the gradient to a random new color combo.

Save → Source Control → stage → commit `Add color button` → push. Wait 30 seconds. Refresh your live URL. **Your change is live for the whole internet.**

That's the loop. Everything in Parts 2 and 3 is variations on it.

**Stretch (if you finish early):** prompt for one more thing — make your name type itself out, add emoji rain on click, hide an easter egg. Then commit + push + refresh.

---

## Part 2 — Build your project (Classes 2 & 3)

Two classes building something you actually want to build.
### 1. Pick something you actually want to build

The best projects come from "I wish ___ existed" or "wouldn't it be funny if ___."

Prompts to find an idea:
- A small tool I wish existed for [my hobby / my homework / my friends]
- A game I'd actually play for 5 minutes
- A page I'd send to one specific person to make them laugh / impress them / help them
- Something I always look up online — could I make my own version?
- A weird, useless, beautiful thing that exists only because I made it

If you're stuck, skim [Project ideas](#project-ideas) at the bottom — but use them as starting points, not a menu. Customize. Make it about something *you* care about.

**Constraints (so you don't over-scope):**
- It must run in a web browser
- It should not require user accounts/login 
- You must be able to ship a working version in two classes
### 2. Write a one-pager

New folder, open in Cursor, create `BRIEF.md`:

```markdown
# [Project Name]

## What it is (one sentence)


## Who it's for
[Yourself? A specific person? A specific kind of person? Be honest.]

## The 3 things it MUST do
1.
2.
3.

## Nice-to-haves (only if there's time)
-
-

## The vibe
[Light/dark? Playful/serious? Fast/calm? One screen or many? Mobile or desktop?]

## What "done" means
[The smallest version you'd be okay shipping if everything else fell apart.]
```

Read it out loud to a partner. They should be able to repeat back what you're building. If they can't, your brief needs work.

### 3. Get the AI's stack recommendation

In Cursor, type `@BRIEF.md` to attach your brief, then:

> Read my brief. Recommend a stack and project structure. I'm a high school student who's never built a web app — optimize for: I want every line readable to me, I want to ship in 2 class hours + an evening, I'll deploy to Vercel. What do you suggest, and why?

If it suggests something you don't recognize ("Tailwind", "Vite", "component"), ask:

> What is [thing]? Why are you suggesting it for this?

Probe before committing:

> What's the simpler alternative? Why didn't you suggest that?
> What part of this is most likely to give me trouble?

When you've decided:

> Let's go with [your choice]. Build the smallest version that does ONLY my must-haves. Make it work end-to-end before making it pretty.

Run it. Push to GitHub. Import to Vercel. **You're now on the internet.** Even if it's ugly and minimal. From now on every push auto-deploys — you'll be using your live URL as your testing surface.

### 4. Build → test → iterate

This is the rhythm for every minute of the rest of Part 2:

```
Prompt (one idea) → Run it → Read what changed → Use it like a user → Commit when it works → Next prompt
                                                       ↓
                                          If broken: be specific about the gap
```

**Habits that separate finished projects from stuck ones:**

| Habit | Why |
|---|---|
| Read what the AI wrote, even when it works | You can't debug code you've never seen |
| Run the code every few prompts | Don't accumulate broken changes you can't see |
| Commit small and often (every 15–20 min when something works) | You can roll back when the AI breaks something |
| One idea per prompt | Bundling three asks is a recipe for a rewrite of half your project |
| Update `BRIEF.md` when plans change | If you drop a feature or pivot, write it down |
| Ask "why" when you don't understand | The AI is an expert — use it as one |

**How to test what you just built:**
- Use the thing the way a real user would. Click every button. Try empty input. Try wrong input. Refresh mid-flow.
- If you find a bug, write down *exactly* what you did and what you expected before asking the AI to fix it. Vague descriptions get vague fixes.
- After every commit, open your live URL (not just localhost) — sometimes things break only after deploy.

**When stuck:**

- *"It worked an hour ago and now it doesn't."* That's what commits are for. `git log --oneline` to find the last good one. `git restore .` wipes uncommitted changes back to your last commit.
- *"It kind of works but it's not what I wanted."* Be specific about the gap. Not "make it better" — describe what's wrong. *"The button works but it's tiny. Make it big, centered, contrasting color."*
- *"The AI keeps making the same mistake."* Be more specific ("Do not change the file structure. Do not add libraries.") OR start a new chat — sometimes context gets muddled.
- *"I don't know what to build next."* Open `BRIEF.md`. Which must-have is least done? Build that.
- *"I'm not understanding the code anymore."* Ask: *"Give me a one-paragraph summary of what each file is doing and how they connect."*

By the end of Class 3, your three must-haves should work end-to-end. It doesn't need to be pretty. It needs to do the thing.

---

## Part 3 — Ship (Class 4)

Your project works.

1. **Fix the one most bug.** 

2. **Visual polish.** Prompt:

   > Improve the visual design without changing features. Cohesive palette fitting [your theme], better typography, subtle hover animations.

3. **Rename your Vercel URL.** Vercel dashboard → your project → Settings → Domains → so it's `<projectname>.vercel.app` instead of `<projectname>-3kj2-max.vercel.app`.

4. **Write a real `README.md`** at the root of your repo:

   ```markdown
   # [Project Name]

   [One-sentence description.]

   **Live demo:** https://your-project.vercel.app

   ## What it does
   [2–3 sentences. Who it's for, what it does, why you made it.]

   ## How it was built
   Built with [stack] using Cursor's AI assistance.

   ## Screenshot
   ![Screenshot](screenshot.png)
   ```

5. **Add a screenshot.** `Cmd+Shift+4` to capture, save as `screenshot.png` in your repo root.

6. **Final commit and push.** Now the test: open the live URL on your **phone**. Does it work? Hand your phone to the person next to you. Does it work for them? If yes, you've shipped.

### Submit

Paste two URLs into the class showcase doc:

1. **Live URL** (`https://<your-project>.vercel.app`)
2. **GitHub repo URL** (`https://github.com/<you>/<your-repo>`)

That's submission. No file uploads, no zips, no PDFs.

---

## How you're graded

**One question:** Did you ship something that works, that you actually wanted to make?

- **"Works"** = deployed at a public URL, reachable from a phone, does what it claims.
- **"Actually wanted to make"** = not the bare-minimum example. It's a real swing at something *you* cared about — ambitious, weird, personal, funny, whatever. You'd be a little proud to text it to a friend.

Pass = both. That's the whole rubric.

If your project isn't deployed by end of Class 4, that's the only way to miss this — talk to me before the deadline so we fix it together.

---

## Quick reference

### Cursor essentials

| Action                       | Shortcut                                        |
| ---------------------------- | ----------------------------------------------- |
| Open AI chat                 | `Cmd+L`                                         |
| Inline edit highlighted code | `Cmd+K`                                         |
| Open terminal                | `` Cmd+` ``                                     |
| Source Control sidebar       | sidebar icon — use this, not the terminal       |
| Switch model                 | bottom-right of chat — `Auto` is unlimited free |
| Quick open file              | `Cmd+P`                                         |
| Command palette              | `Cmd+Shift+P`                                   |

**Three rules:**
1. Read code before accepting. If unclear, ask "explain this."
2. When stuck, paste the actual error verbatim — don't paraphrase.
3. Save (`Cmd+S`) and commit every time something works.

### The deploy loop

```
Edit in Cursor → Source Control: Stage → Commit → Push
                       ↓
              Vercel auto-deploys (~30 sec)
                       ↓
                Refresh your live URL
                       ↓
                  Got an idea? GOTO 1
```

**One-time per project:** create empty GitHub repo → clone in Cursor → build → commit + push → vercel.com → New Project → Import → Deploy. From then on, every push auto-deploys.

### Prompting principles

1. **Describe outcomes, not implementations.** "Make the score pop visually" not "use a CSS keyframe with scale and color."
2. **State constraints up front.** "Plain HTML, single file, no frameworks." Otherwise it'll quietly add React.
3. **One idea per prompt.** Bundling three asks into one is a recipe for a rewrite of half your project.
4. **When stuck, paste the actual error.** Browser console → copy → into chat. Don't summarize.
5. **Ask the AI to plan before coding for big changes.** *"Don't write code yet. Walk me through what you'd build, what files would change, what could go wrong. Then I'll green-light."*
6. **If two attempts didn't fix it, change strategy.** Start a new chat or rephrase the goal.
7. **Use the AI to teach you.** *"Walk me through what you just wrote, like I'm a student who's only ever written Java."*
8. **Never paste real passwords or API keys** into a prompt.
9. **Taste is yours, not the AI's.** Cursor gives you generic-modern every time. Your colors, your jokes, your details = your project.

### The 5 git commands you actually need

```bash
git status                       # what's changed
git add .                        # stage all changes
git commit -m "what you changed" # take a snapshot
git push                         # upload to GitHub
git restore .                    # nuke uncommitted changes (rollback)
```

You can do all of this from Cursor's Source Control sidebar (no terminal needed), but knowing the commands helps when something goes weird.

### Common fixes

| Symptom | Fix |
|---|---|
| Mac won't let you install Cursor | System Settings → Privacy & Security → Allow |
| `git push` asks for password | Cursor will prompt for browser auth — let it |
| Vercel deploys but page is blank | Check capitalization — `Index.html` ≠ `index.html`. Open browser dev tools → Console for the real error |
| Push rejected ("non-fast-forward") | Source Control → ⋯ → Pull → push again |
| AI keeps wrecking working code | One change at a time. Run after each. Commit when it works. |
| Live site shows old version | Hard refresh `Cmd+Shift+R`. Vercel takes ~30 sec — wait. |
| Cursor requests run out | Switch model to `Auto` — unlimited free |
| `node_modules` showing up in git status | Ask Cursor: "add a .gitignore for a node project" |

---

## Project ideas

Don't pick one verbatim. Just ideas.

### AI-powered apps
The AI isn't just your engineer — it can be a feature. Use the OpenAI / Anthropic / Gemini API (free tiers cover a demo) to build things that were impossible two years ago. These will require an API key. Never put an API key in your HTML or JavaScript — anyone who visits your site can read it. These projects need a serverless function (a separate file in /api/) to hold the key. Ask Cursor to show you how.

- **Roast my Spotify** — paste a playlist link → AI roasts (or compliments) your taste in the voice of Anthony Bourdain / Pitchfork / your strictest teacher.
- **AI rap battle** — pick two characters + a topic, get a 4-bar battle.
- **Live closed-captions, but funny** — browser speech-to-text → AI rewrites it as Shakespeare / a sports announcer / a court reporter.
- **An AI editor for one specific thing** — Common App essays, DMs that need help, your AP Lit thesis.
- **"What would [character] say about my day?"** — paste your day, get a reaction in the voice you pick.

### Games with real depth
Not single-screen clickers.

- **Real-time multiplayer drawing/guessing** with a friend over a shared URL (PeerJS handles peer-to-peer — no server).
- **A platformer where you draw your own levels** mid-play.
- **A physics sandbox** — drag objects, gravity + collisions + chain reactions.
- **Chess against a real engine** (chess.js + stockfish). Make a custom theme.
- **Daily Wordle** with a custom word list and a shareable result image friends will actually post.

### Generative art, music, and creative tools
The browser is a canvas. The Web Audio API is a synthesizer. Both are wildly underused.

- **Music sequencer** — tap a 16-step grid to compose a beat. Export the audio.
- **Visual synthesizer** — your voice or a song controls a real-time visual.
- **Drum machine where your voice is the kick** — record samples in browser, sequence them.
- **Constellation viewer** — the actual sky over your location tonight.
- **Generative [poetry / posters / jewelry]** — refresh the page, get something new and good.

### Real-time + real data
Pull live data. Visualize it beautifully.

- **Live ISS tracker** with a 3D rotating Earth.
- **Live earthquake monitor** — a sound on every tremor in the last hour.
- **"Where in the world is it raining"** globe, updating in real time.
- **Spotify Wrapped, but right now** — paste a playlist, get a beautiful one-page vibe recap.
- **Live flight globe** — every commercial flight in the air, right now.
- **Today's weather as a vibe** — fetch weather, play a matching playlist, paint the scene.
- **1980s news ticker** — but it's live stock prices, crypto, or your friends' Instagram follow counts.

### Webcam + microphone experiments

- **Webcam → ASCII / pixel art / glitch art** in real time.
- **Voice-controlled anything** — say "left," your character moves left. Browser speech recognition.
- **"Blink to advance"** slideshow / story / game.
- **A live mood ring for your room** — listens, paints colors based on what it hears.

### Tools that actually solve a real problem
The bar: someone uses it within a week without you reminding them.

- **Notes-to-flashcards** — paste your AP Bio notes, get a spaced-repetition quiz.
- **"What should I cook"** — list what's in your fridge + restrictions → real recipes.
- **Receipt splitter** — itemized, everyone clicks what they ordered, math handled.
- **College decision dashboard** — list schools, rank, see stats vs. each, compare side-by-side.
- **Lyric translator** — paste foreign lyrics → translated + transliterated karaoke text.
- **Group decision wheel** — share a link, friends drop options in from their phones, spin together.
- **Chore divider** for your house or group project, with fairness math.
- **A studying-vs-procrastinating timer** that screenshots what's on your screen at random intervals.

### Personal, weird, portfolio
A page on the internet that says something only *you* would make.

- **A digital time capsule** that unlocks on a future date.
- **A senior yearbook page** every classmate adds a memory to (Google Sheet as the backend — no auth needed).
- **A "send me a postcard"** page — visitors leave a 10-second audio clip + a doodle.
- **A spiritual successor to a website you loved as a kid** that no longer exists.
