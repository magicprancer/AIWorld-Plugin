# AIWorld Plugin

AIWorld is a Minecraft PaperMC 1.21.1 plugin for AI-powered NPCs.  
It includes:

- **TownsModule**: Town NPCs that can work, build, and talk  
- **SurvivorsModule**: Wild NPCs that explore, gather, and survive  
- **MagicModule**: Magical NPCs that cast spells and give quests  
- **AdminModule**: AI server tools and admin commands  

## Commands

- `/ainpc create <name> <personality>` — Spawn a Town NPC  
- `/aiadmin <question>` — Ask AI admin (placeholder response)  

## Config

Edit `config.yml` to add your OpenAI API key:

```yaml
openai_api_key: "YOUR_KEY"
npc_response_timeout_seconds: 10
enable_admin_ai: true
max_concurrent_ai_calls: 3
