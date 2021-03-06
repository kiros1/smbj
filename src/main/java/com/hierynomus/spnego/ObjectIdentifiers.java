/*
 * Copyright (C)2016 - SMBJ Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hierynomus.spnego;

import org.apache.commons.ssl.org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.apache.commons.ssl.org.bouncycastle.asn1.iana.IANAObjectIdentifiers;

public class ObjectIdentifiers {

    public static final ASN1ObjectIdentifier SPNEGO = IANAObjectIdentifiers.security_mechanisms.branch("2");
}
