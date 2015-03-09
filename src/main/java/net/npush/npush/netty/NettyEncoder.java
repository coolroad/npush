/**
 * Copyright (C) 2015 npush.net Holding Limited
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
package net.npush.npush.netty;

import net.npush.npush.protocol.RemotingCommand;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * 协议编码器
 * @author dql<dongqianlin@gmail.com>
 * @since 2015-03-09
 */
public class NettyEncoder extends MessageToByteEncoder<RemotingCommand> {

	@Override
	protected void encode(ChannelHandlerContext ctx, RemotingCommand msg,
			ByteBuf out) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
