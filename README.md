# web3j-maven-example
Example of using Web3j in a Java 8 project with Maven, as completed in the JAX Workshop Thursday 12th October 2017, presented by [Conor Svensson](https://github.com/conor10).

His Web3j project can be found [here](https://github.com/web3j/web3j).
The project used for the workshop can also be found on GitHub [here](https://github.com/blk-io/jaxlondon).

## Tutorial
I have included all the notes that I took during the workshop as Wiki pages for this project so that the steps I took to create this project are set out clearly. Each section of the Java project pages can be linked back to versions of the code in this repository by looking through the commit history.

These pages will hopefully offer guidance to others completely new to the blockchain technology, as well as act as a thorough reference for myself in the future!

### Prerequisites
In order to follow the steps in the tutorial, it is necessary to have both Ethereum, Solidity and the Web3j CLI tools available for use on the command line. As I was using a Mac at the time that I did this, I can easily offer the Homebrew commands.
```
brew update
brew upgrade
brew tap ethereum/ethereum
brew install ethereum
brew install solidity
brew tap web3j/web3j
brew install web3j
```

## Wallet Gist
https://gist.github.com/JacqMT/a4fa17725a6bb5f52e8bd30478f8ebbd
