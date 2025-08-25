def call(Map args = [:]) {
    int v   = (args.value ?: 1) as int
    int min = (args.min   ?: 1) as int
    int max = (args.max   ?: 5) as int
    if (min > max) { int t = min; min = max; max = t }
    return Math.max(min, Math.min(v, max))
}
