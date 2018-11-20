package csc472.depaul.edu.dungeonsndragons.Jobs;

public enum Item
{
    CLUB                ("Club"),
    DAGGER              ("Dagger"),
    GREATCLUB           ("Great Club"),
    HANDAXE             ("Hand Axe"),
    JAVELIN             ("Javelin"),
    LIGHT_HAMMER        ("Light Hammer"),
    MACE                ("Mace"),
    QUARTERSTAFF        ("Quarter-Staff"),
    SICKLE              ("Sickle"),
    SPEAR               ("Spear"),
    LIGHT_CROSSBOW      ("Light Crossbow"),
    DART                ("Dart"),
    SHORTBOW            ("Short Bow"),
    SLING               ("Sling"),
    BATTLEAXE           ("Battle Axe"),
    FLAIL               ("Flail"),
    GLAIVE              ("Glaive"),
    GREATAXE            ("Great Axe"),
    GREATSWORD          ("Great Swrod"),
    HALBERD             ("Halberd"),
    LANCE               ("Lance"),
    LONGSWORD           ("Longsword"),
    MAUL                ("Maul"),
    MORNINGSTAR         ("Morningstar"),
    PIKE                ("Pike"),
    RAPIER              ("Rapier"),
    SCIMITAR            ("Scimitar"),
    SHORTSWORD          ("Shortsword"),
    TRIDENT             ("Trident"),
    WAR_PICK            ("War Pick"),
    WARHAMMER           ("War Hammer"),
    WHIP                ("Whip"),
    BLOWGUN             ("Blow Gun"),
    HAND_CROSSBOW       ("Hand Crossbow"),
    HEAVY_CROSSBOW      ("Heavy Crossbow"),
    LONGBOW             ("Longbow"),
    NET                 ("Net"),
    EXPLORERS_PACK      ("Explorer's Pack"),
    DIPLOMATS_PACK      ("Diplomat's Pack"),
    ENTERTAINERS_PACK   ("Entertainer's Pack"),
    PRIESTS_PACK        ("Priest's Pack"),
    DUNGEONEERS_PACK    ("Dungeoneer's Pack"),
    BURGLARS_PACK       ("Burglar's Pack"),
    SCHOLARS_PACK       ("Scholar's Pack"),
    COMPONENT_POUCH     ("Component Pouch"),
    PADDED              ("Padded"),
    LEATHER             ("Leather"),
    STUDDED_LEATHER     ("Studded Leather"),
    HIDE                ("Padded"),
    CHAIN_SHIRT         ("Chain Shirt"),
    SCALE_MAIL          ("Scale Mail"),
    BREASTPLATE         ("Breastplate"),
    HALF_PLATE          ("Half Plate"),
    RING_MAIL           ("Ring Mail"),
    CHAIN_MAIL          ("Chain Mail"),
    SPLINT              ("Splint"),
    PLATE               ("Plate"),
    SHIELD              ("Shield"),
    LUTE                ("Lute"),
    OTHER_INSTR         ("Other Instrument"),
    BOLTS               ("Bolts"),
    ARROWS              ("Arrows"),
    DARTS               ("Darts"),
    HOLY_SYMBOL         ("Holy Symbol"),
    DRUIDIC_FOCUS       ("Druidic Focus"),
    THIEVES_TOOLS       ("Thieves' Tools"),
    ARCANE_FOCUS        ("Arcane Focus"),
    SPELLBOOK           ("Spellbook");

    private String item;

    Item(String item) { this.item = item; }
    public String GetItemName() { return item; }
}