const emptySet = new Set<number>()

class ComponentType {
  pushes: Map<number, Set<number>>

  constructor() {
    this.pushes = new Map()
    this.pushes.set( 1, new Set( [2, 3] ) )
    this.pushes.set( 2, new Set( [ 4 ] ) )
  }

  getPushesFromPinNumber( number: number): Set<number> {
    if ( this.pushes.has( number ) ) {
      return this.pushes.get( number )
    }
    return emptySet
  }
}