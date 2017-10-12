package org.train;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;

import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.exceptions.TransactionTimeoutException;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

public class FundsService {
    public static void main(String[] args) throws IOException, CipherException, InterruptedException,
                                                    ExecutionException, TransactionTimeoutException {
        Web3j web3 = Web3j.build(new HttpService());
        String walletId = "4a50789f96b4121a14974d607d6a0f5384ec4af4";
        String walletSource = "/Users/j.train/testnet-keystore/UTC--2017-10-12T11-10-59.66000000Z--" + walletId + "" +
                ".json";
        Credentials credentials = WalletUtils.loadCredentials(args[0], walletSource);
        String myWalletAddr = "0x" + walletId;
        TransactionReceipt transactionReceipt = Transfer.sendFundsAsync(web3, credentials, myWalletAddr,
                BigDecimal.valueOf(0.2), Convert.Unit.ETHER).get();
        System.out.println("Funds transfer completed...");
        System.out.println("Hash: " + transactionReceipt.getBlockHash());
        System.out.println("Block number: " + transactionReceipt.getBlockNumber());
    }
}
