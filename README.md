# TurboPay System

## Overview

TurboPay is a financial services platform that enables users to perform money transfers and pay various bills seamlessly. The system offers a range of services, including transfers to other TurboPay accounts, bank accounts, mobile wallets provided by telecom companies or banks, and utility bill payments for gas, electricity, and water.

## Requirements

### User

1. **User Registration:**
   - Users can sign up through two methods:
     - Register using their bank account and the registered mobile number with the bank (verified through the bank API).
     - Register using their mobile number with a wallet provided by a wallet provider (e.g., Vodafone Cash, CIB) – the mobile number needs to be verified with the wallet provider.
   - After verification, users must enter a unique username and a secure password.
   - Mobile number ownership is verified through OTP.

2. **User Authentication:**
   - Users can sign in to TurboPay using their unique username and password.
   - Upon logging in, the user's profile is loaded based on their registration type.

3. **Transaction Options:**
   - Both types of users can:
     - Transfer funds to a mobile wallet using the recipient's mobile number.
     - Transfer funds to another TurboPay account.
     - Inquire about their account balance.
     - Pay utility bills.

4. **Bank Account Transfer:**
   - Transferring to a bank account is only valid for users registered using their bank account.

5. **Utility Bill Payment:**
   - Users can create and pay bills for gas, electricity, and water.
   - Bill contents may vary based on the bill types, and assumptions should be made for bill details.

## UML Diagram (draw.io)
**https://app.diagrams.net/#G1ujdB7nN9I8EcVysOtgyoIfCUh3dSmBHH**
